import java.io.Serializable;


public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pincode,city;

	public Address(String pincode, String city) {
		this.pincode = pincode;
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	
}
