package pkg;

public class Address 
{
	private String street;
	private String state;
	private String pincode;
	
	public void displayAddress()
	{
		System.out.println("Street :" + street);
		System.out.println("State :" + state);
		System.out.println("Pincode :" + pincode);
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}