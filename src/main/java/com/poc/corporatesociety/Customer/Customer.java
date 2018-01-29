package com.poc.corporatesociety.Customer;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customers")
public class Customer {
	@Id
	private String id;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String name;
	private String contactNo;
	private Date createdon;
	private String emailId;
	private String password;
	private String userName;
	
	public Customer(String name,String contactNo,String emailId,String password,String userName) {
		this.name = name;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.password = password;
		this.userName = userName;
	}
	
	public Customer() {
		//default constructor
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContactNo() {
		return contactNo;
	}
	
	public Date getCreatedon() {
		return createdon;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}
	
}
