package day15;

public class AnimalTestSuper {

	public static void main(String[] args) {
		
		Animal an =new Animal();
	//we have create object of parent class so get parent class output
		// for child class w need to create object of child 
		
		System.out.println(an.colour);
		an.eat();
		
		
		Dog d = new Dog();
		System.out.println(d.colour);
		d.displayColour();
		
		// if we use SUPER keyword in child class then we get parent class parameters
	
		d.eat();
	
	}

}
