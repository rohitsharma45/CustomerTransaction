package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Credentials")
@NamedQueries({
	@NamedQuery(name="getCredentials",query="Select log from LoginBean log")
})
public class LoginBean {

	@Id
	@Column(name="user_name")
	@NotBlank(message="Invalid username")
	private String username;
	@Column(name="passwords")
	@NotBlank(message="Invalid password")
	private String password;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password
				+ "]";
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
	
}
