package com.flightapp.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private DataSource dataSource;
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http.httpBasic()
	    .and()
	    .authorizeRequests()
		.antMatchers("/api/v1.0/flight/airline/register").hasAnyRole("CUSTOMER", "ADMIN")
		.antMatchers("/api/v1.0/flight/airline/inventory/add").hasRole("ADMIN")
		.antMatchers("/api/v1.0/flight/search").hasRole("CUSTOMER")
		.antMatchers("/").permitAll()
		.antMatchers("/api/v1.0/flight/admin/login").permitAll()
		.anyRequest().authenticated()
        .and()
        .csrf().disable();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception
	{	 
		authenticationMgr.jdbcAuthentication().dataSource(dataSource)
		.authoritiesByUsernameQuery("SELECT user.email as username, role "
		          + "from user "
		          + "where user.email = ?")
		.usersByUsernameQuery("SELECT user.email as username, password, enabled "
		          + "from user "
		          + "where user.email = ?");
	} 
}