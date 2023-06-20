package com.sliit.mtit.microservice.assignment4.customeraccountservice.dto;

public class CustomerAccountRequest {

	private String firstName;
	private String lastName;
	private String nicNo;
	private String email;
	private String phoneNo;
	private String address;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the nicNo
	 */
	public String getNicNo() {
		return nicNo;
	}
	
	/**
	 * @param nicNo the nicNo to set
	 */
	public void setNicNo(String nicNo) {
		this.nicNo = nicNo;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerAccountRequest [firstName=" + firstName + ", lastName=" + lastName + ", nicNo=" + nicNo
				+ ", email=" + email + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	
}
