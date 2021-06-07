package com.flightapp.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "discount", catalog = "flightbooking")
public class Discount implements java.io.Serializable
{
	private String code;
	private String discountRate;
	private Short avialability;
	private Set<User> users = new HashSet<User>(0);

	public Discount() {
	}

	public Discount(String code) {
		this.code = code;
	}

	public Discount(String code, String discountRate, Short avialability, Set<User> users) {
		this.code = code;
		this.discountRate = discountRate;
		this.avialability = avialability;
		this.users = users;
	}

	@Id
	@Column(name = "code", unique = true, nullable = false, length = 20)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "discount_rate", length = 45)
	public String getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	@Column(name = "avialability")
	public Short getAvialability() {
		return this.avialability;
	}

	public void setAvialability(Short avialability) {
		this.avialability = avialability;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "discount")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}