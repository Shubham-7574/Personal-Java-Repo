/* Write a java program to get number from user and print whether it is positive or negative. */
package Test;
import java.util.Scanner;
public class JavaAssignment2 {

	public static void main(String[] args) {
	
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a Numner");
		float UserInput= S.nextFloat();
		
if(UserInput>0) {System.out.println("Number is positive");

}
else
	System.out.println("Number is negative");}

}
