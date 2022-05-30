package fundamentals;

import java.util.Scanner;

public class TEmployee extends Employee{
	
	double overTime;
	
public void storeData(Employee eData,Address eAddress, double overTime) {
		super.storeEmployeeData(eData.Empid, eData.name,eData.city,eData.esalary,eData.eAddress);
		this.overTime = overTime;
	}

public void displayData() {
	super.displayEmployeeData();
	System.out.println("Overtime: " + overTime);
}
}