/* Write a java program to get grater number from 3 number */
package Test;

import java.util.Scanner;

public class JavaAssigment2 {

	public static void main(String[] args) {
		/*
		 * Scanner UserInput = new Scanner(System.in);
		 * System.out.println("User input 1"); float UserInput1 = UserInput.nextFloat();
		 * System.out.println("User input 2"); float UserInput2 = UserInput.nextFloat();
		 * System.out.println("User input 3"); float UserInput3 = UserInput.nextFloat();
		 * 
		 * if (UserInput1 >= UserInput2) { System.out.println("Greater is "+
		 * UserInput1);} else if (UserInput2 >= UserInput3){
		 * System.out.println("Greater is "+ UserInput2); if (UserInput1 >= UserInput3){
		 * System.out.println("Greater is "+ UserInput3); }
		 */
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter 3 Number");
		float UserInput1 = Scanner.nextFloat();
		float UserInput2 = Scanner.nextFloat();
		float UserInput3 = Scanner.nextFloat();

		/*
		 * double result = (UserInput1 > UserInput2) ? ((UserInput2 > UserInput1) ?
		 * UserInput1 : UserInput2) : ((UserInput2 > UserInput3) ? UserInput2 :
		 * UserInput3); System.out.println(result);
		 */

		double result = Math.max(UserInput1, Math.max(UserInput2, UserInput3));
		System.out.println(result);
	}

}
