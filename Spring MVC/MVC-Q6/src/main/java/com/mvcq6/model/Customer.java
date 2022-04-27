package com.mvcq6.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Customer {
	@NotBlank(message = "Should not be Empty")
	@Pattern(regexp = "[A-Za-z0-9]{8,20}", message = "Must be Alphanumeric and should have lenght 8 to 20")
	private String username;

	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&.])[A-Za-z\\d$@$!%*?&.]{8,20}", message = "Password should contain at least one upper- case letter, lower-case letter, a digit or special character (_, $, #, ., @). Password should also be 8 to 20 characters long.")
	private String password;

	@NotBlank(message = "Enter Email")
	@Email(message = "enter valid email")
	private String email;

	@Digits(message = "Number should contain 10 digits.", fraction = 0, integer = 10)
	private String contact;

	@NotBlank
	private String city;

	@NotBlank
	@Pattern(regexp = "[0-9]{6}", message = "Length should be 6")
	private String zipcode;

	public Customer() {
		super();
	}

	public Customer(
			@NotBlank(message = "Should not be Empty") @Pattern(regexp = "[A-Za-z0-9]{8,20}", message = "Must be Alphanumeric and should have lenght 8 to 20") String username,
			@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&.])[A-Za-z\\d$@$!%*?&.]{8,20}", message = "Password should contain at least one upper- case letter, lower-case letter, a digit or special character (_, $, #, ., @). Password should also be 8 to 20 characters long.") String password,
			@NotBlank(message = "Enter Email") @Email(message = "enter valid email") String email,
			@Digits(message = "Number should contain 10 digits.", fraction = 0, integer = 10) String contact,
			@NotBlank String city,
			@NotBlank @Pattern(regexp = "[0-9]{6}", message = "Length should be 6") String zipcode) {
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
