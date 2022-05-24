package bank;

public class Address {
	
	String street,state,country;
	int pincode; 
	
	public void storeData(String street, String state, String country, int pincode) {
		this.street = street;
		this.state = state;
		this.country = country;
		this.pincode= pincode;
	}
	
	public void displayData() {
		System.out.println("Address: ");
		System.out.println(street+" "+state+" "+country+" "+pincode);
	}

}
