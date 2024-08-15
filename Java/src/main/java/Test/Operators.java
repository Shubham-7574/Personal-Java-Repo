package Test;

public class Operators {
	public static void main(String[] args) {
		/*
		 * int a=10; int b=20; int c=a+b; System.out.println("Sum of A+B is "+ c );
		 */

		int a = 10;
		int b = 20;
		// Arthimatic operation +,-,*,/,%

		System.out.println("Arthimatic Operator");
		System.out.println("Sum of A+B is " + (a + b));
		System.out.println("Diff of A-B is " + (a - b));
		System.out.println("Mul of A*B is " + (a * b));
		System.out.println("Div of A/B is " + (a / b));
		System.out.println("per of A%B is " + (a % b));

		// Relational Operator (Comparison operation) ==,<, >, <=, >=, !=
		// BOOLEAN OUTPUT
		System.out.println("Relational Operator");
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a != b);

		// Logical Operator &&, ||,!
		// BOOLEAN OUTPUT
		boolean x = true;
		boolean y = true;
		System.out.println("Logical Operator");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		// Increment/Decrement operator ++, --
		System.out.println("Increment/Decrement Operator");
		a = 40;
		int k = a++ - ++a + a++; // pre-Increment/Decrement
		System.out.println(k);

		b = 50;
		b++;
		System.out.println(b);
	}
}
