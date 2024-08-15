package Test;

import java.util.Arrays;

public class AssignmentArraysSort {
public static void main(String[] args) {
	int array[] = {99,55,78,3,4,57,46};
	System.out.println("Before sorting the 2nd arrays" + Arrays.toString(array));
	Arrays.sort(array);
	System.out.println("After sortinf the 2nd arrays"+Arrays.toString(array));
	
	/* Sorting elements
a={50,20,40,10,100}

after sorting 10 20 40 50 100
*/
	
int	a[]={50,20,40,10,100};
System.out.println("Before sorting the 2nd arrays" + Arrays.toString(a));
Arrays.sort(a);
System.out.println("After sortinf the 2nd arrays"+Arrays.toString(a));
	
}
}
