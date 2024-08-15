package day14;
//Aquiring all the properties(Variables) & behaviour(methods) from one class to another class is called inheritance.
//types
//3) hierarchy
class parent 
{
	void parentdisplay(int a)
	{
	System.out.println(a);	
	}
}

class child1 extends parent
{
	void child1display(int b)
	{
	System.out.println(b);	
	}
}

class child2 extends parent
{
	void child2display(int c)
	{
	System.out.println(c);	
	}
}
public class HierarchyInheritance {

	public static void main(String[] args) {
	//we can access data of parent class in child class but child class does not access each others data.
		
		child1 c1= new child1();
		c1.child1display(1);
		c1.parentdisplay(1);
		
		child2 c2 = new child2();
		c2.child2display(2);
		c2.parentdisplay(2);
	}

}
