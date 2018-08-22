package ZensorPractise;

public interface Transactions {
	public void createAccount(String name,int amount);
	public void deposit(int accno,double amount);
	public void withdraw(int accno,double amount);
	public void viewBalance(int accno);
	public void checkBalance(int accno);
	public void sortByName();
	public void sortByAcc();

}
