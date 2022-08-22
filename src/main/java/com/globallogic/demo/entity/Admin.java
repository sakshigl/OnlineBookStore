package com.globallogic.demo.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String username, String password, String email, List<User> user) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", user="
				+ user + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@Column
	String email;
	
	@OneToMany
	List<User> user;
	
	
	

}
