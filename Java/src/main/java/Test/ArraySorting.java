package Test;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int a[] = {100,889,522,344,999,787,002,656,899};
		System.out.println("Before sorting the arrays "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting the arrays  "+Arrays.toString(a));

		
		String s[] = {"David", "Shubham", "Pratap", "Max", "AJAY"};
		System.out.println("Before Sorting the string "+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After Sorting the String  "+Arrays.toString(s));
	}

}
