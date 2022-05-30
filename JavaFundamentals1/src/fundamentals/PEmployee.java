package fundamentals;

import java.util.Scanner;

public class PEmployee extends Employee {
	
	String passport;
	double ebonus;
	
	public void storeData(Employee eData,Address eAddress,String epassport, double ebonus) {
		
		super.storeEmployeeData(eData.Empid, eData.name,eData.city,eData.esalary,eData.eAddress);
		this.passport = epassport;
		this.ebonus = ebonus;
	}
	public void displayData() {
		super.displayEmployeeData();
		System.out.println("Passport: " + passport);
		System.out.println("Bonus: "+ ebonus);
	}
} 