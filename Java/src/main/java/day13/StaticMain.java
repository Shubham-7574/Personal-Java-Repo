package day13;

public class StaticMain {

	 public static void main(String[] args) {
	        // 1) static method access only static stuff without object creation
	      //  System.out.println(a);   // in this class this statment is not getting executed
	      //  m1();                   // bcaz staticMain is not aware about this 
	                                // for overcome this we need to provide class name 
	        
		 
		 System.out.println(StaticKeyword.a);   
	       StaticKeyword.m1();      
	        // System.out.println(b);  // cannot access non-static variable without object creation
	        // m2();  // non-static method can't be accessed without object creation
	        
	        // 2) static method access non-static stuff with object creation
	        StaticKeyword sk = new StaticKeyword();
	        System.out.println(sk.b);
	        sk.m2();
	        
	        // Calling non-static main() method
	        sk.main(); // Call the non-static main() method
	    }
}
