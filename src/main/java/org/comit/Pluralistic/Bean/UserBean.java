package org.comit.Pluralistic.Bean;

import java.util.List;

public class UserBean {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	
	//List<RoleBean> roles;
	RoleBean role;
	
	public UserBean() {

	}

	
	public UserBean(String firstName, String lastName, String username, String password, RoleBean role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.role = role;
	}


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


	public RoleBean getRole() {
		return role;
	}


	public void setRole(RoleBean role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "UserBean [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", role=" + role + "]";
	}

	
	}
