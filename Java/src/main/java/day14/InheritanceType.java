package day14;

//Aquiring all the properties(Variables) & behaviour(methods) from one class to another class is called inheritance.
//types
//-------
//1) single
//2) multi level
//3) hierarchy
//4) multiple


	
	class A
	{
		int a =100;
		void display()
		{
		System.out.println(a);
		}
	}
	
	class B extends A
	{
		int b =200;
		void show() 
		{
		System.out.println(b);
	    }
	}
		class C	 extends B
	{
		int c =300;
		void print()
		{
		System.out.println(c);
	    }
		
		
	}
	public class InheritanceType {
	public static void main(String[] args) {
	/*B bobj=new B();
	System.out.println(bobj.a);
	System.out.println(bobj.b);
	bobj.display();
	bobj.show();
	*/
		
		C cooj = new C();
		System.out.println(cooj.a);
		System.out.println(cooj.b);
		System.out.println(cooj.c);
		cooj.display();
		cooj.show();
		cooj.print();
		
		
	}
	}
	 
