<<<<<<< HEAD
/*
 * package mvc.q3.login;
 * 
 * public class Login { String username; long password; String email;
 * 
 * public Login() { super(); }
 * 
 * public Login(String username, Long password, String email) { super();
 * this.username = username; this.password = password; this.email = email; }
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public long getPassword() { return password; }
 * 
 * public void setPassword(long password) { this.password = password; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * }
 */

package mvc.q3.login;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {
	@NotBlank
	@Size(min = 2)
	String username;
	@NotBlank
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")
	String password;
	@NotBlank
	String email;

	public Login(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Login() {
		super();
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

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", email=" + email + "]";
	}

}
=======
/*
 * package mvc.q3.login;
 * 
 * public class Login { String username; long password; String email;
 * 
 * public Login() { super(); }
 * 
 * public Login(String username, Long password, String email) { super();
 * this.username = username; this.password = password; this.email = email; }
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public long getPassword() { return password; }
 * 
 * public void setPassword(long password) { this.password = password; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * }
 */

package mvc.q3.login;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {
	@NotBlank
	@Size(min = 2)
	String username;
	@NotBlank
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")
	String password;
	@NotBlank
	String email;

	public Login(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Login() {
		super();
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

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", email=" + email + "]";
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
