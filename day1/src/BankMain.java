
public class BankMain {

	public static void main(String[] args) {
		Account acc=new Account(5000);
		//System.out.println("Name "+acc.name);
		System.out.println("Name "+acc.getName());
		//System.out.println("Account Locked? "+acc.locked);
		//System.out.println("Balance : "+acc.balance);
		
		double newBalance=acc.deposit(3000);
		System.out.println(newBalance);
		

	}

}
