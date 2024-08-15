package day12;

public class MethodeOverloading {

	int x,y,z;
	double d;
	
	void sum() { //1
		x=10;
		y=20;
		System.out.println(x+y);
		
	}
	
	void sum (int a, int b) { //2
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double b) { //3 
		x=a;
		d=b;
		System.err.println(x+d);
		
	}
	
	void sum(double b, int a) { //4
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	void sum(int a, int b, double c) {  //5
		x=a;
		y=b;
		d=c;
		System.out.println(x+y+d);
	}
	 
	void sum (int a, int b, int c) {  //6
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
		}
	public static void main(String[] args) {
		MethodeOverloading mo = new MethodeOverloading();
		
		mo.sum();
		mo.sum(10.20, 50);
		mo.sum(8, 77.330);
		mo.sum(7, 8);
		mo.sum(2, 3, 99.99);
		mo.sum(4, 5, 6);
		}
	
}
	