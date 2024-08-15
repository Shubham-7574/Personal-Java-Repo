/* Write a java program to get table of 5 */
package Test;
import java.util.Scanner;
public class JavaAssignmant2 {

	public static void main(String[] args) {
		Scanner Scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= Scanner.nextInt();
		table(num);
}
public static void table(int a)
{
	for (int i=1; i<=10; i++)
	{
		System.out.println( a+"*"+i+ "=" +(a*i));
	}
	}
}