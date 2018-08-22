package ZensorPractise;
import java.util.Scanner;

public class Bank_Application {

	public static void main(String[] args) {
		Account_Operation acc_op=new Account_Operation(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("              ***Welcome to Online Banking***");
		char choice;
		int accno;
		int openamount;
		String name;
		double amount;
		do
		{
			System.out.println("\n"+"n.Create New Account \nd.Deposit  \nw.Withdraw  \nb.Balance Check  \nv.View Statement  \ns.Sort by name  \na.Sort by Account number  \nx.Exit");
			System.out.println("\nEnter your choice:");
			 choice=sc.next().charAt(0);
			switch(choice)
			{
			case 'n': System.out.println("Please enter the following details to create a new account: ");
			          System.out.println("Name of the account holder: ");
			          name=sc.next();
			          System.out.println("Enter the initial opening balance: ");
			          openamount=sc.nextInt();
			          acc_op.createAccount(name,openamount);
			          break;
			          
			case 'd': System.out.println("Enter your account number and amount to deposit");
				     accno=sc.nextInt();
				     amount=sc.nextDouble();
				    acc_op.deposit(accno,amount);
				    break;
			case 'w': System.out.println("Enter your account number and amount to withdraw");
		               accno=sc.nextInt();
		              amount=sc.nextDouble();
		               acc_op.withdraw(accno,amount);
		               break;
			case 'b': System.out.println("Enter your account number");
		                accno=sc.nextInt();
		                acc_op.checkBalance(accno);
		                break;
			case 'v':System.out.println("Enter your account number");
			         accno=sc.nextInt();
			         acc_op.viewBalance(accno);
		                 break;
			case 's': acc_op.sortByName();
			          break;
			case 'a': acc_op.sortByName();
	                   break;          
			default: choice='x';
				     break;             
		    }
		}while(choice!='x');
           
	}

}
