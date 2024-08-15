package day15;

class bank
{ 
	double roi()
	{
	return 0;
    }
}

class ICICI extends bank
{
	double roi()
	{
	return 10.2;
    }
	
}

class SBI extends bank 
{
	double roi() 
	{
		return 9.0;
	}
	}



public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI Cbank = new ICICI();
		System.out.println(Cbank.roi());
		
		SBI Sbank = new SBI();
		System.out.println(Sbank.roi());
	}
	

}
