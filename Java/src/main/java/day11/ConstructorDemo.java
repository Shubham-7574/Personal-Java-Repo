package day11;

public class ConstructorDemo {
  
	int x,y ;
	String s;
	
	/*ConstructorDemo(){ //default constructor
		x=10;
		y=20;
		s= "Pawan";
		
	}*/
	
	ConstructorDemo(int a , int b , String str){ //parameterized  constructor
		x=a;
		y=b;
		s= str;
		
	}
	
	void disply() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	
	
	public static void main(String[] args) {
	//	ConstructorDemo cd = new ConstructorDemo(); //invoked default constructor
		ConstructorDemo cd = new ConstructorDemo(10,20,"Hello"); //invoked parameterized constructor
		cd.disply();
	}

}
