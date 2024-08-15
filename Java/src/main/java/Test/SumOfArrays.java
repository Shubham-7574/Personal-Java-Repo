package Test;

import java.util.Arrays;

public class SumOfArrays {
/*
 *  1) Find Sum of Elements in Array
a={1,2,3,4,5}
Sum=15 
 */
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Befor the sum"+Arrays.toString(a));
		int asum = 0;
		for(int num : a)    // int num is used for stored the number for each iteration, and "a" is a array.
		{
			asum += num;    // this is use for add the current element (num) into asum 
		}
		System.out.println(asum);
	}
	
	
}
