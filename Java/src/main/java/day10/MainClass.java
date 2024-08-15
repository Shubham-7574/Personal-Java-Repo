package day10;

public class MainClass {
public static void main (String args []) {
	
	Employee emp= new Employee();
	emp.eid =101;
	emp.ename = "David";
	emp.esal= 8000;
	emp.job= "Manager";
	emp.dispayempdata();
	
	Student stu = new Student();
	 stu.grade= 'A';
	stu.sid=1009;
	stu.sname= "Pratik";
	stu.dispaystupdata();

}
}
