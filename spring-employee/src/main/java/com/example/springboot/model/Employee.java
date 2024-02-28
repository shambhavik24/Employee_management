package com.example.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFirstName(Object firstName) {
		// TODO Auto-generated method stub
		
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLastName(Object lastName) {
		// TODO Auto-generated method stub
		
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(Object email) {
		// TODO Auto-generated method stub
		
	}

	

	
     
}
