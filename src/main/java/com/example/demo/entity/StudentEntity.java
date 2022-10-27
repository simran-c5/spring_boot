package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@Column(name="S_Id")
	private int S_Id;
	
	@Column(name="lastname")
	private String lastname;
	@Column(name="firstname")
	private String firstname;
	
	
	
	public StudentEntity() {
		
	}
	public StudentEntity(int s_Id, String lastname, String firstname) {
		
		S_Id = s_Id;
		this.lastname = lastname;
		this.firstname = firstname;
	}
	public int getS_Id() {
		return S_Id;
	}
	public void setS_Id(int s_Id) {
		S_Id = s_Id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	
	
}
