package day16;

interface Shape {
	int Lenght = 10; // final & static
	int width = 20; // final & static

	void circle();

	// if you want create normal method in interface the
	// we need to mention the method default or static
	default void square() {
		System.out.println("this is default method");
	}

	static void rectangle() {
		System.out.println("this is default method");
	}
}

public class InterfacrDemo implements Shape {

	void triangle() {
		System.out.println("this is triangle method");
	}

	public void circle() {
		System.out.println("this is abstract method - circle implemented method");
	}

	public static void main(String[] args) {

		// Scenario1
		InterfacrDemo idobj = new InterfacrDemo();
		idobj.circle();
		idobj.triangle();
		idobj.square();
		// idobj.rectangle(); //not valid
		Shape.rectangle();

		// Scenario1
		// Shape sh = new Shape(); //we can not create object for interface

		Shape sh = new InterfacrDemo();
		// we can create object for a class but
		// we can create variable for interface.

	//sh.triangle(); // not valid bcoz this method belogs from class not from interface 
	sh.circle();
	sh.square();
	//sh.rectangle; not valid 
	Shape.rectangle();
	
	}

}
