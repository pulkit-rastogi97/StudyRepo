
public class Medicine {

	private String name;
	private String address;
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
	public Medicine()
	{
		this.name="RANBAXY";
		this.address="Delhi";
	}
	public void displayLabel()
	{
		System.out.println("Name of the Company : "+this.getName());
		System.out.println("Address : "+this.getAddress());
	}
	
	
}
