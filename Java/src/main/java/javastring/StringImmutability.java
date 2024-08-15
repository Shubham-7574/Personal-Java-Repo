package javastring;

public class StringImmutability {

	public static void main(String[] args) {

		
		String  str = new String ("Welcome");
		String str1=str.concat(" to java ");
		System.out.println(str); //cannot change - immutable 
        System.out.println(str1);
	}

}
