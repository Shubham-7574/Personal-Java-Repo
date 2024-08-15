package day15;

public class Animal {

	String colour ="white";
	
	void eat()
	{
System.out.println("	eating...	");	
	}
}



class Dog extends Animal 
{
String colour ="black";
	
	void eat()
	{
//System.out.println("eating bread");
		super.eat(); // get parent class parameter
		
}
	void displayColour()
	{
		System.out.println(super.colour);
	}
}