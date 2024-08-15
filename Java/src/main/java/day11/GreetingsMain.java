package day11;

public class GreetingsMain {
public static void main (String aregs[]) {
	Greetings grt= new Greetings();
	////1) No Params   No return value
	grt.greeting1();
	
	////2) No Params   Return value
	String Str=grt.greeting2();
	System.out.println(Str);
	 
	System.out.println(grt.greeting2());
	
	//3) Take params  No Return
	grt.greeting3("Krishna");
	
	//4) Take params  Return a value
	System.out.println(grt.greeting4("Pratik"));
	String Str1=grt.greeting4("Vinayak");
	System.out.println(Str1);
}
}
