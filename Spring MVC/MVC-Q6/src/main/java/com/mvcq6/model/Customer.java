package com.mvcq6.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotBlank
	@Size(min = 8, max = 20)
	String username;
	@NotBlank
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")
	String password;
	@NotBlank
	@Email
	String email;
	@NotNull
	@Size(min = 100000000, max = 1000000000)
	long contact;
	@NotBlank
	String city;
	@NotNull
	long zipcode;

	public Customer() {
		super();
	}

	public Customer(@NotBlank @Size(min = 8, max = 20) String username,
			@NotBlank @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$") String password,
			@NotBlank @Email String email, @NotNull @Size(min = 100000000, max = 1000000000) long contact,
			@NotBlank String city, @NotNull long zipcode) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + ", zipcode=" + zipcode + "]";
	}

}
