package test;

interface Shape {

	void area();

}

class Circle implements Shape {

	@Override
	public void area() { // should always be public
		System.out.println("Area of circle --pi r square");
	}

	// overloading example
	public void area(int radius) {
		System.out.println("Area of circle --pi r square" + (3.14 * (radius * radius)));
	}

	public void area(int radius, String str) {
		System.out.println("Area of circle --pi r square" + (3.14 * (radius * radius)));
	}
}

public class TestClass {
	public static void main(String s[]) {

		Circle obj = new Circle();
		obj.area(20);
	}
}