package javastring;

public class JavaString {

	public static void main(String[] args) {
		// method of string
		String s = " Welcome ";
		String s1 = " To Java";

		System.out.println(s.length()); // Length() method it will give you length of string
		System.out.println("Length method :"+s1.length());

		System.out.println("Concat Method :"+s.concat(s1)); // concat() method it will help you to add two string

		System.out.println("Trim Method :"+s.trim()); /*
										 * Trim () method it will help you to remove extra space which is on left &
										 * right side of string
										 */

		String s2 = "Shubham";
		System.out.println("charAtMethod :"+s2.charAt(2)); /* charAt() method it will help you to print the index value string */

		String s3 = "Patil";
		System.out.println("contains Method :"+s3.contains("til")); /*
										 * contains() method give true o/p if string sequence match else give false
										 */

		System.out.println(s3.contains("Til"));

		String s4 = "Shubham Patil";
		System.out.println("equals method :"+s4.equals("Shubham Patil")); /*
														 * equals() is case sensitive method we need to enter full
														 * string and it gives true,false o/p.
														 */
		System.out.println(s4.equals("shubham patil"));

		String s5 = "Shubham Patil";
		System.out.println("equalsIgnoreCase method : " +s5.equalsIgnoreCase("shubham patil")); /*
																	 * equals() is not case sensitive method we need to
																	 * enter full string and it gives true,false o/p.
																	 */
System.out.println("replace ouput");
		String s6 = "Welcome";
		System.out.println("replace method :"+s6.replace('e', 'a')); /*
													 * replace method is use to change the alphabet or word of String
													 */
		String s66 = "Welcome To Java";
		System.out.println("replace method :"+s66.replace("Java", "Selenium"));
		
		//Substring is use for print the o/p from starting index to ending index. (ending index start from 1)
		String s67 = "Shubham";
		System.out.println("substring method :"+s67.substring(0, 4)); 
		
		String s68 = "Youtube";
		System.out.println(s68.substring(3, 7)); 

		
		//toLowerCase() is return the string in lowercase letters.
		//toUpperCase () is return the string in uppercase letter.
		
		String p48 = "DHarMa";
		System.out.println("toLowerCase method :"+p48.toLowerCase());
		
		String p49 = "dharma";
		System.out.println("toUpperCase Method :"+p49.toUpperCase());
	}

}
