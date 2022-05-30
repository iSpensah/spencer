package fundamentals;

public class Address {
	
	String Street;
	String State;
	String pinCode;
	
	public void storeAddressData(String street, String state, String pinCode) {
		this.Street = street;
		this.State = state;
		this.pinCode = pinCode;
	}
	public void displayAddressData() {
		System.out.println(Street + " " + State + " " + pinCode);
	}
}
