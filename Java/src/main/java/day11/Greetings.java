package day11;

public class Greetings {

	        // types of constructor
	        //1) No Params   No return value
			//2) No Params   Return value
			//3) Take params  No Return
			//4) Take params  Return a value
	
	 //1) No Params   No return value
	void greeting1() {
		System.out.println("Hello greeting1");
			
	}
	//2) No Params   Return value
	String greeting2() {
	return("Hello greeting2 ");
			
	}
	
	//3) Take params  No Return
	void greeting3(String name) {
		System.out.println("Hello " + name);
	}
	
	//4) Take params  Return a value
	String greeting4(String name) {
		return("Hello " + name);
	}
}
