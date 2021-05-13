package com.cg.bookstore.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.apache.tomcat.jni.Address;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	
	@NotNull
    @Size(min=1,message="required") 
	private String email;
	
	@NotNull
    @Size(min=1,message="Enter fullname required") 
	private String fullName;
	
	@NotNull
	@Size(min = 10, message="Mobile no should be in 10 digits")
	private String mobileNumber;
	
	
	 @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="customer")
	private Address address;
	 
	 @NotNull 
	 @Size(min=1,message = "password should not be null")
	private String password;

	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@NotNull
	@Size(message = "Please provide a date.")
	private LocalDate registerOn;

	public Customer() {
		super();
	}
	
	public Customer(int customerId, String email, String fullName, String password, Address address,
			String mobileNumber, LocalDate registerOn) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
	    this.address = address;
		this.mobileNumber = mobileNumber;
		this.registerOn = registerOn;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public LocalDate getRegisterOn() {
		return registerOn;
	}
	public void setRegisterOn(LocalDate registerOn) {
		this.registerOn = registerOn;
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setAddress(String string) {
		// TODO Auto-generated method stub
//		
}
}	
