package day_1;

public class Person {

	String name;
	Address address;
	

	//Tight Coupling
	
/*	public Person()
	{
		name="xyz";
		address = new Address("pune","411040");
	}*/
	
	//Loose Coupling is either implemented by Parameterizd constructor or by using setter methods;
	//Loose Coupling
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}

	//Other option to implement Loose Coupling
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
