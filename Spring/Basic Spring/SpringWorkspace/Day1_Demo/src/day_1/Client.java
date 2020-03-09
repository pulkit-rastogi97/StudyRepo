package day_1;

public class Client 
{
	public static void main(String[] args) 
	{
		
		Address address = new Address("pune","411040");
		
		Person person = new Person("Priya",address);
		
		System.out.println("Name = "+person.getName());
		
		System.out.println("City = "+person.getAddress().getCity());
		
		System.out.println("Pincode = "+person.getAddress().getPincode());
		
	}
}
