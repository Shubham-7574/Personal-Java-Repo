package Test;

public class WhileLoopStatement {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10)

		{
			System.out.println(i);
			i++;
			System.out.println("Even Number");

			i = 2;
			while (i <= 10) {
				System.out.println(i);
				i += 2;

				System.out.println("odd Number");
				i = 1;
				while (i <= 10) {
					System.out.println(i);
					i += 2;
				
					System.out.println("Decrement Numberr");
					i=10;
					while(i>=0) {
					System.out.println(i);
					i--;
				}
				}
			}
		}

	}

}
