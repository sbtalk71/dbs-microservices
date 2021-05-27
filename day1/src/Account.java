
public class Account {

	private double balance;
	private int locked;
	private String name;
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	public Account(double balance,String name) {
		this(balance);
		this.name=name;
	}
	
	public Account(double balance,String name,int locked) {
		this(balance,name);
		this.locked=locked;
	}
	
	public double deposit(double amount) {
		balance=balance+amount;
		return balance;
	}
	
	
	public void setLocked(int locked) {
		this.locked=locked;
		
	}
	
	public int getLocked() {
		return this.locked;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
