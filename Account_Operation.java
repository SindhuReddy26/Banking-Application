package ZensorPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import collections.Employee;
//import collections.SortByName;

public class Account_Operation  implements Transactions {
	private int current_acc=4;
	private int last_accno=10005;
	Account ac[]=new Account[100];
	DayBook dybook[]=new DayBook[200];
	private static int no_of_transactions=0;
	public Account_Operation()
	{
		
		
			ac[0]=new Account(10001,"Padma",6000);
			ac[1]=new Account(10002,"Padmini",300);
			ac[2]=new Account(10003,"Ramya",86054.40);
			ac[3]=new Account(10004,"Pooji",78000);
			ac[4]=new Account(10005,"Raji",0);
	}
	public void createAccount(String name,int amount)
	{
		last_accno++;
		current_acc++;
		ac[current_acc]=new Account(last_accno,name,amount);
		
		System.out.println("Account created successfully..");
		System.out.println("Account Details:"+"\n"+"  Acc No: "+last_accno+"  Name: "+name+"  Current Balance: "+ac[current_acc].getBalance());
		
		
	}

	public void deposit(int accno, double amount) {
		int f=0;
		for(int i=0;i<=current_acc;i++)
		{
			int acc=ac[i].getAccount_number();
			if(acc==accno)
			{
				f=1;
				double bal=ac[i].getBalance();
				bal=(bal+amount);
				ac[i].setBalance(bal);
				System.out.println("Deposited Successful!! New Balance=:"+ac[i].getBalance());
				dybook[no_of_transactions]=new DayBook("7-july-2018",accno,ac[i].getCustomer_name(),"credit","cheque deposit",ac[i].getBalance());
				no_of_transactions++;
				break;
			}
		}
		try
		{
		if(f==0)
		{
			throw new Account_DoesNot_ExsistException();
		}
		}
		catch(Account_DoesNot_ExsistException no_acc_number)
		{
			System.out.println(no_acc_number.getMessage());
		}
		
	}

	@Override
	public void withdraw(int accno, double amount)
	{
		int f=0;
		double bal;
		try
		{
		for(int i=0;i<=current_acc;i++)
		{
			
			int acc=ac[i].getAccount_number();
			if(acc==accno)
			{
				f=1;
			    bal=ac[i].getBalance();
				if(bal<amount)
				{
					System.out.println("Current Balance is only:"+ac[i].getBalance());
					throw new InsufficientBalanceException();
				}
				bal=(bal-amount);
				ac[i].setBalance(bal);
				System.out.println("Withdraw Successful! New Balance=:"+ac[i].getBalance());
				dybook[no_of_transactions]=new DayBook("7-july-2018",accno,ac[i].getCustomer_name(),"debit","cash withdrawl",ac[i].getBalance());
				no_of_transactions++;	
               
			}
		}
		if(f==0)
		{
			throw new Account_DoesNot_ExsistException();
		}
	}
		catch(Account_DoesNot_ExsistException | InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void checkBalance(int accno) {
		int f=0;
		for(int i=0;i<=current_acc;i++)
		{
			int acc=ac[i].getAccount_number();
			if(acc==accno)
			{
				f=1;
		System.out.println("Balance=:"+ac[i].getBalance());
		break;
			}		
    	}
		try
		{
		if(f==0)
		{
			throw new Account_DoesNot_ExsistException();
		}
		}
		catch(Account_DoesNot_ExsistException no_acc_number)
		{
			System.out.println(no_acc_number.getMessage());
		}
}
	
	public void viewBalance(int accno)
	{
		System.out.println("Date       Account_Number    Name        Transaction_Type        Description      Balance ");
		System.out.println("----------------------------------------------------------------------------------------------");
		int f=0;
		int i;
		for(i=0;i<no_of_transactions;i++)
		{
			int acc=dybook[i].getAcno();
			if(acc==accno)
				
			{
				f=1;
				System.out.println(dybook[i].getDate()+"      "+dybook[i].getAcno()+"      "+dybook[i].getName()+"         "+dybook[i].getTransType()+"              "+dybook[i].getDescription()+"         "+dybook[i].getAmount());
			    
			}
		}
		try
		{
		if(f==0)
		{
			throw new Account_DoesNot_ExsistException();
		}
		}
		catch(Account_DoesNot_ExsistException no_acc_number)
		{
			System.out.println(no_acc_number.getMessage());
		}
		
	}

		

public void sortByName()
{
	TreeSet<DayBook> treeset=new TreeSet<DayBook>(new SortByName());
	for(int i=0;i<no_of_transactions;i++)
	{
		treeset.add(dybook[i]);
	}
	System.out.println("Complete Bank transactions ordered by customer name: ");
	System.out.println("Date    Account_Number    Name       Transaction_Type  Description   Balance ");
	System.out.println("---------------------------------------------------------------------------------");
	for(DayBook dy:treeset){
		System.out.println(dy.getDate()+"         "+dy.getAcno()+"       "+dy.getName()+"     "+dy.getTransType()+"        "+dy.getDescription()+"        "+dy.getAmount());
	    	}
}
@Override
public void sortByAcc() {

	ArrayList<DayBook> list=new ArrayList<DayBook>();
	
	for(int i=0;i<no_of_transactions;i++)
	{
		list.add(dybook[i]);
	}
	Collections.sort(list,new SortByAcc());
	System.out.println("Complete Bank transactions ordered by account number: ");
	System.out.println("Date    Account_Number    Name       Transaction_Type  Description   Balance ");
	System.out.println("---------------------------------------------------------------------------------");
	for(DayBook dy:list){
		System.out.println(dy.getDate()+"         "+dy.getAcno()+"       "+dy.getName()+"     "+dy.getTransType()+"        "+dy.getDescription()+"        "+dy.getAmount());
	    	}
}
}
