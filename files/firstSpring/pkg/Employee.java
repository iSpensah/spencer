package pkg;

import java.util.List;

public class Employee {
	private int eid;
	private String ename;
	private int esalary;
	private Address eaddress;
	
	private List<String> hobbies;
	
	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		System.out.println("----Spring called----");
		this.hobbies = hobbies;
	}

	public void displayEmployee()
	{
		System.out.println("Eid :" + eid);
		System.out.println("Name :" + ename);
		System.out.println("Salary:" + esalary);
		eaddress.displayAddress();
		
		for(String hobby: hobbies) {
			System.out.print(hobby + " ");
		}
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public Address getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}
}