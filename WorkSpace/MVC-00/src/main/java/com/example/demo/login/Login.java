package com.example.demo.login;

public class Login {
	private String username;
	private String password;
	private String email;
	private Long number;

	public String getUsername() {
		return username;
	}

	public Login(String username, String password, String email, Long number) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.number = number;
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

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", email=" + email + ", number=" + number
				+ "]";
	}
}
