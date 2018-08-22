package ZensorPractise;

public class Account {
	private int  account_number;
	private String customer_name;
	private double balance;
	public Account(int account_number, String customer_name, double balance) {
		
		this.account_number = account_number;
		this.customer_name = customer_name;
		this.balance = balance;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
