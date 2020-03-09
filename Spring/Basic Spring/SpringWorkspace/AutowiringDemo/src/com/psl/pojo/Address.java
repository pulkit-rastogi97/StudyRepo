package com.psl.pojo;



public class Address {

	String city, pincode;
	
	public Address()
	{
		System.out.println("in default of address");
	}

	public Address(String city, String pincode) {
		super();
		System.out.println("In parametrized of address");
		this.city = city;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		System.out.println("set city address");
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		System.out.println("set pincode address");
		this.pincode = pincode;
	}
	
}
