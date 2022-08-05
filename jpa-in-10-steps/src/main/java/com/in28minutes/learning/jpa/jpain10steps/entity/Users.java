package com.in28minutes.learning.jpa.jpain10steps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//Table - Users
@Table
@Entity(name="suman_1")
public class Users {
	
	@Id
	@GeneratedValue(generator = "CUST_SEQ")
    @SequenceGenerator( sequenceName = "id_seq", allocationSize = 1, name = "CUST_SEQ")
	@Column(name="id")
	private long id;
	
	@Column
	private String name;
	@Column
	private String role;
	
	
	public Users() {
		
	}

	public Users(String name, String role) {
		super();
		this.id=id;
		this.name = name;
		this.role = role;
	}

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
}
