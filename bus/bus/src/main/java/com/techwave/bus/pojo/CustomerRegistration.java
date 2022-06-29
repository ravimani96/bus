package com.techwave.bus.pojo;


public class CustomerRegistration 
{
	
private int custid;
private String name;
private String address;
private String city;
private String state;
private String country;
private int pincode;
private String email;
private String gender;
private int contactno;
private String customertype;
private String password;

public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getContactno() {
	return contactno;
}
public void setContactno(int contactno) {
	this.contactno = contactno;
}


public String getCustomertype() {
	return customertype;
}
public void setCustomertype(String customertype) {
	this.customertype = customertype;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public CustomerRegistration() {
	super();
}
public CustomerRegistration(int custid, String name, String address, String city, String state, String country,
		int pincode, String email, String gender, int contactno,String customertype,
		String password) {
	super();
	this.custid = custid;
	this.name = name;
	this.address = address;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
	this.email = email;
	this.gender = gender;
	this.contactno = contactno;
	
	this.customertype = customertype;
	this.password = password;
}


}
