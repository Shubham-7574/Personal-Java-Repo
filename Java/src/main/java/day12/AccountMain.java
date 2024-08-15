package day12;

public class AccountMain {

	public static void main(String[] args) {
		
 Account acc=new Account();
 
 acc.setName("Kiran");
 acc.setAmount(99999);
 acc.setAccno(20288);
 
 System.out.println(acc.getAccno());
 System.out.println(acc.getAmount());
 System.out.println(acc.getName());
	}

}
