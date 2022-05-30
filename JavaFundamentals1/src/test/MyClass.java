package test;

class Check {
	
	int a = 10;
	void incrementA(){
		a++;
		System.out.println("value of a: " + a);
	}
}
public class MyClass {
	
	void fun() {
		Check obj  = new Check();
		obj.incrementA(); 
		obj.incrementA();
		System.out.println("");
		
		Check obj1  = new Check();
		obj.incrementA();
	}
	public static void main (String[] args) {
		MyClass obj = new MyClass();
		obj.fun();
		Check obj1= new Check();
		obj1.incrementA();
		System.out.println("Hello");
	}
}
