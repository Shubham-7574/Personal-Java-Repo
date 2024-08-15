package day12;

public class ConstructorOverloading {
	
	int x,y;
	double z;
	
	ConstructorOverloading(){ // 1 default constructor
		
		x=10;
		y=20;
		z=99.99;
		
	}
	
	ConstructorOverloading(int a , int b){ //2 Parameterized constructor
		x=a;
		y=b;
		
	}
	ConstructorOverloading(int a ,double b){//3
		x=a;
		z=b;
		
	}
	ConstructorOverloading(double b ,int a){//4
		x=a;
		z=b;
		
	}
	
	ConstructorOverloading(int a ,int b, double c){//5
		x=a;
		y=b;
		z=c;
		
	}
	
	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		ConstructorOverloading co1 =new ConstructorOverloading();
		co1.displayData();
		ConstructorOverloading co2 =new ConstructorOverloading(12, 23);
		co2.displayData();
		ConstructorOverloading co3 =new ConstructorOverloading(12, 23.99);
		co3.displayData();
		ConstructorOverloading co4 =new ConstructorOverloading(10.66,33);
		co4.displayData();
		ConstructorOverloading co5 =new ConstructorOverloading(1,33,00.999);
		co5.displayData();
	}

}
