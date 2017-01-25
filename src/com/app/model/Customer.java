package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer 
{
	//Properties 
	@Id
	@Column(name="cust_id")
	public int custId;
	@Column(name="cust_name")
	public String custName;
	@Column(name="cust_contact")
	public String custContact;
	@Column(name="cust_address")
	public String custAddress;
	@Column(name="cust_email")
	public String custEmail;

	//constructor
	
	public Customer(int custId, String custName, String custContact, String custAddress, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custContact = custContact;
		this.custAddress = custAddress;
		this.custEmail = custEmail;
	}
	
	public Customer() {
		super();
	}

	//getters and setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	//toString
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custContact=" + custContact
				+ ", custAddress=" + custAddress + ", custEmail=" + custEmail + "]";
	}
}
