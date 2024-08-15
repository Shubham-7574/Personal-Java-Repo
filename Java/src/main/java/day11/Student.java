package day11;

public class Student {

	int sid;
	String sname;
	char grade;
	
	Student(int id, String name, char grd){ //constructor
		sid=id;
		sname=name;
		grade=grd;
		
	}
	//constuctor name shoilde be same as class name .
	//it not return any data 
	//data will call @time of object creation.
	
	
	void printstudata() {   //userdefind method 
	System.out.println(sid);	
	System.out.println(sname);
	System.out.println(grade);
	}

	void setdata(int id, String name, char grd) {  //userdefind method 
		sid=id;
		sname=name;
		grade=grd;
		
	}
}
