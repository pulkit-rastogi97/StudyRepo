package com.psl.pojo;

import java.util.List;
import java.util.Map;

public class Person
{
	String name;

	Map<String,Map<Integer,Address>> map;

	
	public Person()
	{
		name="abc";
	map=null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Address> getMap() {
		return map;
	}

	public void setMap(Map<String, Address> map) {
		this.map = map;
	}
	

//	public List<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}

	/*public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}*/

	
	
	
}
