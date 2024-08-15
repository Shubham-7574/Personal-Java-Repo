
package Test;


public class ArraysAssignment {

	
	public static void main(String[] args) {
		// write a java program to calculate sum of an array
		int a [] = {10,20,30,40,50,60};
		int sumb=0 ;
		for (int number:a ) {
			sumb+= number;
		}
		System.out.println("Sum of a "+ sumb);
		
		int arrays [][] = {{78,89,45}, {89,56,12},{76,13,14}};
		int sum=0;
		for (int i=0; i< arrays.length;i++ ) {
			for(int j=0;j< arrays[i].length;j++ ) {
				
				sum += arrays[i][j];
	
				System.out.println("Sum of arrays "+ sum);
				}	
		}
		
		
		
		//Write a Java program to search specific number in an array.
		System.out.println(a[3]);
		
		
		
		
		// Define an array with some string values, write a Java program to search specific string in an array.
		
		
		
		
		

	//	Write a Java program to print even and odd numbers in an array.
		
		
		

	//	Write a program to find greatest and smallest element in an array.
		
		

	//	Write a program to add two matrices.
	}

}
