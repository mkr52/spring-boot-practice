package com.mkr.app.ws.ui.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRequestModel {
	
	@NotNull(message="First name cannot be missing or empty")
	private String firstName;
	@NotNull(message="Last name cannot be missing or empty")
	private String lastName;
	
	@Email
	private String email;
	@NotNull(message="Password is a required field")
	@Size(min=8, max=16, message="Password must be equal to or greater than 8 characters and less than 16 characters")
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
