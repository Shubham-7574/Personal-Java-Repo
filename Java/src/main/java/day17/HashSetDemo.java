package day17;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//declaration 
		HashSet myset = new HashSet();
		
		//adding data in set
		myset.add(100);
		myset.add(100);
		myset.add(100.20);
		myset.add(true);
		myset.add(null);
		myset.add(null);// multiple null can not add like aarylist
		myset.add("welcome");
		
		System.out.println(myset);//[null, 100, 100.2, welcome, true]
		
		//size ofset
		System.out.println("size ofset "+myset.size());
		
		//remove data from set direct specifed value to remove data 
		//no need give indexnumber like arraylist
		myset.remove(null);
		System.out.println(myset); //after removing set 
		
		
		
		
	}

}
