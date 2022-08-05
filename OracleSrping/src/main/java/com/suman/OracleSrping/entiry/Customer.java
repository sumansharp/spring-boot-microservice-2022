package com.suman.OracleSrping.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="suman_1")
public class Customer {
	@Id
	@GeneratedValue(generator="CUST_SEQ")
	@SequenceGenerator(sequenceName ="id_seq", allocationSize=1, name= "CUST_SEQ")
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="role")
	private String role;
	
	
	public Customer() {
		super();
	}
	public Customer(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	

}
