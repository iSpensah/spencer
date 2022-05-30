package test;

class Parent {
	void fun() { // put final to prioritize this function so it cannot be overriden and used by
					// the child class
		System.out.println("Parent fun");
	}

	void xyz() {
		System.out.println("Parent xyz");
	}
}

class Child extends Parent {
	void fun() {
		System.out.println("Child fun");
	}
}

public class Test {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.fun();
		obj.xyz();
	}
}