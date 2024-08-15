 package day13;

public class ThisKeyword {
	
	int x,y;// class variable / instance variable
	
	
	void setdata(int x ,int y ) { // x, y in method is local variable 
		this.x=x;  // use this keyword we can clear that variable
		            // from class
		this.y=y;
	}
	
	void displayData() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
ThisKeyword th=new ThisKeyword();
th.setdata(100, 200);
th.displayData();
	}

}
	