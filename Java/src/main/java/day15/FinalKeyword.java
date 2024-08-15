package day15;


class Test {
	
	final int x=100;
	
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.x);
		
		//we mention final for variable then we cant change the value
		//t.x=200;
		System.out.println(t.x);
		
	}

}
