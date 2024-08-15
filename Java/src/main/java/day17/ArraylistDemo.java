package day17;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		//declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		
		//ArrayList<Integer> mylist=new ArrayList<Integer>();
		//ArrayList<String> mylist=new ArrayList<String>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of arraylist
		System.out.println("size of array list "+mylist.size());
		System.out.println("data before removing data  of array list "+mylist);
		mylist.remove(5);// 5th element 
		//after removing the data
		System.out.println("data  of array list "+mylist);
		mylist.add(3,"java");
		//after adding the data
		System.out.println("data after adding data in array list "+mylist);
		//getting the data 
		System.out.println(mylist.get(2));
	}

}
