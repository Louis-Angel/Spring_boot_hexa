package com.flightapp.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private DataSource dataSource;
	

	
	//Enable jdbc authentication
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
        .dataSource(dataSource)
        .usersByUsernameQuery("SELECT email, password "
          + "from user "
          + "where email = ?")
        .authoritiesByUsernameQuery("select email, role "
          + "from user "
          + "where email = ?");
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/api/v1.0/flight/airline/register").hasAnyRole("CUSTOMER", "ADMIN")
		.antMatchers("/api/v1.0/flight/search").hasAnyRole("CUSTOMER")
		.antMatchers("/api/v1.0/flight/airline/inventory/add").hasAnyRole("ADMIN")
		.antMatchers("/api/v1.0/flight/admin/login").permitAll();

		//http.csrf().disable();
	}

    /*remove this in memory authentication configuration
	 @Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication()
		.withUser("name1").password("admin").roles("ADMIN").and()
		.withUser("name2").password("javainuse").("ROLE_USER", "ROLE_ADMIN");
	} */
}
