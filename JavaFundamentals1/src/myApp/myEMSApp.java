package myApp;

import java.util.Scanner;

import fundamentals.Address;
import fundamentals.Employee;
import fundamentals.TEmployee;
import fundamentals.PEmployee;

public class myEMSApp extends Employee {
	
	public static void main (String[] args) {
		
		System.out.println("Enter a p if Permanent | t if Temporary");
		Scanner in = new Scanner(System.in);
		String choice;
		choice = in.next();
		if(choice.equals("a"))
		
		System.out.println("Enter id,name,city and salary");
		int empid = in.nextInt();
		String ename = in.next();
		String city = in.next();
		double esalary = in.nextDouble();
		
		System.out.println("Enter street,state and pincode");
		String street = in.next();
		String state = in.next();
		String pincode = in.next();
		
		//System.out.println("Enter overTime");
		//double overTime = in.nextDouble();
		
		System.out.println("Enter Passport, Ebonus");
		String epassport = in.next();
		double ebonus = in.nextDouble();
		
		Address eaddress = new Address();
		eaddress.storeAddressData(street, state, pincode);
		Employee emp = new Employee(); 
		emp.storeEmployeeData(empid,ename,city,esalary,eaddress);
		
		//TEmployee te = new TEmployee();
		//te.storeData(e, eaddress, overTime);
		//te.displayData();
		
		PEmployee pe = new PEmployee();
		pe.storeData(emp, eaddress, epassport, ebonus);
		pe.displayData();
		
		System.out.println(pe.getName());
	}
}