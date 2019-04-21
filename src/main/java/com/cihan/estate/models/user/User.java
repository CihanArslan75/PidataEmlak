package com.cihan.estate.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cihan.estate.models.BaseEntity;

@Entity
@Table(name = "usr")
public class User extends BaseEntity{
	private int id;
	private String username;
	private int tc;
	private String password;
	private String uname;
	private String surname;
	private String email;
	private Role role;
		
	@Id
	@SequenceGenerator(name = "seq_usr", allocationSize = 1, sequenceName = "seq_usr")
	@GeneratedValue(generator = "seq_usr", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
		public void setId(int id) {
		this.id = id;
	}

	@Column(length = 100, name = "username", unique = true , nullable=false)
	@OrderBy("username ASC")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "tc")	
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "uname")	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Column(name = "surname")
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "role_id")
    @Enumerated
	public Role getRol() {
		return role;
	}

	public void setRol(Role role) {
		this.role = role;
	}
}