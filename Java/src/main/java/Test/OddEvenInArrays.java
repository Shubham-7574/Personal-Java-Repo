package Test;

/*Print Even and Odd numbers  from array.
a={1,2,3,4,5,6,7,8,9}
Even=
Odd=*/

public class OddEvenInArrays {
	public static void main(String[]args) {
		int a [] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Even number");
		
		for (int num : a ) {
			if (num %2 ==0) {
				System.out.println(num);
			}
			
		}
		System.out.println("Odd number");
		for (int num: a) {
			if (num%2 !=0) {
				System.out.println(num);
			}
		}
	}

}
