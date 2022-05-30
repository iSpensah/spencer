package fundamentals;

import java.util.Scanner; //Employee And Address class : Has a Relation ship
public class Employee {
	// int, char, float, long, double. short, boolean, byte,
	
	String cTravelled[]= {"India","US","UK","PH"}; //direct initialization
	String eHobby[];
	
	int Empid; //integers take 4 bytes of memory
	String name; 
	String city;
	double esalary; //doubles take 8 bytes of memory
	Address eAddress;
	
	public void storeEmployeeData(int Empid,String name, String city,double esalary, Address eAddress) {
		this.Empid = Empid;
		this.name = name;
		this.city= city;
		this.esalary = esalary;
		this.eAddress = eAddress;
		
		eHobby = new String[5]; //new means allocate memory of 5 five elements with variable ehobby into type String
		eHobby[0] = "PVG";
		eHobby[1] = "Travelling";
		eHobby[2] = "BB";
		eHobby[3] = "VB";
		eHobby[4] = "TT";
	}
	void displayEmployeeData() {
		System.out.println("Employee Id: "+Empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee City: "+city);
		eAddress.displayAddressData();
		System.out.println("Employee Salary: "+esalary);
		System.out.println("Employee Tax: "+getTax());
		System.out.println("Employee net Salary: "+(esalary-getTax()));
		System.out.println("Employee Hobbies: ");
		
		for (int cnt = 0;cnt<eHobby.length;cnt++) {
			System.out.print(""+eHobby[cnt]+" ");
			}
		System.out.println("");
	}
	double getTax() { //return a double 
		 return 	esalary * 0.10;
	}
	
	public String getName() {
		return this.name;
	}
}