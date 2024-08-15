package Test;

public class IfelseConditionalStatement {
	public static void main(String[] args) {
		/* 1) Greater and Smaller number */
		int a = 20;
		int b = 50;
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		/* 2) Voting */
		int age = 20;
		if (age >= 18) {
			System.out.println("You Can Vote");
		} else {
			System.out.println("yor are not eligible to vote");
		}
		/* 3) Even or odd number */
		int g = 12;

		if (g % 2 == 0)
			if (age >= 18) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
	}
}
