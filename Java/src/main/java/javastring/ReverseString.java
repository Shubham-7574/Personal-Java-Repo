package javastring;

public class ReverseString {

	public static void main(String[] args) {
		
		// Approach 1
/*String str = "Welcome";
		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println(rev);*/
		
		
		
		/*//Approach 2 using array
		  String str1 = "Shubham";
	        String reve = "";
	        
	        char a[] = str1.toCharArray();
	        
	        for (int i =a.length-1 ;i>=0 ;i--){
	            reve = reve + a[i];
	        }
	        
	        System.out.println(reve);
	   */
		
		
		
		//Approach 3 using Stringbuffer and StrindBuilder class
		
		StringBuffer str = new StringBuffer("Welcome");
		
		System.out.println(str);
	    System.out.println("Reverse a String "+str.reverse());
	
	   StringBuilder str1 = new StringBuilder("Selenium");
	   System.out.println(str1.reverse());
	}
	

}
