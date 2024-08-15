package Test;

import java.util.Scanner;

public class TwoDimentinal {

	public static void main(String[] args) {

		int a[][] = new int[3][3];

		a[0][0] = 100; // insert manually row and columns
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;

		System.out.println(a[2][0]);

		int b[][] = { { 50, 75, 25 }, { 125, 150, 0000 }, { 175, 225, 325 } };// insert in single line

		System.out.println("number of rows = " + b.length);
		System.out.println("Number of columns = " + b[1].length);
		System.out.println(b[2][1]);

		// how to read two dimensional array
		for (int i = 0; i < b.length; i++) // outer loop row
		{
			for (int j = 0; j < b[i].length; j++) // inner loop cloumns
			{
				System.out.println(b[i][j]);
			}
		}
		
		int c[][] = {{22,33,44,55,},{66,54,67,76},{12,43,28,90}};
		// Enhanced for loop
		for(int r[]:c)
		{
			for (int i:r)
			{
				System.out.println(i);
			}
		}
		Scanner Scanner = new Scanner(System.in);
		String fixedString="new loop going to start";
		System.out.println("How many times u want to print print string");
		int time = Scanner.nextInt();
		for (int i=0; i< time;i++) {
			System.out.println(fixedString);
		}
		
		int d[][]= {{100,200},{300,400},{500,600},{700,800},{900,1000}};
		
		// Enhanced for loop
		for(int x[]:d) {
           for(int y:x) {
        	   System.out.println(y);
        	   }
           }
	}

}
