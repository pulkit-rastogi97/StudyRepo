package day_1;

public class Address {
	String city;
	String pincode;
	public Address(String city, String pincode) {
		super();
		this.city = city;
		this.pincode=pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
