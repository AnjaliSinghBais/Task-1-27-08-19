package com.ssi.FirstTask;

public class BankAccounts {
	
	 int accNo;
	 String name;
	 int balance;
	 int accType;
  static int  countDeposit=0;
	 static  int countWithdraw;
	
	
	public BankAccounts(int a, String b, int c)
	{
		accNo=a; 
		name=b;
		balance=c;	
		
	}
	
	
	public BankAccounts() {
		
	}


	public  void showDetails(BankAccounts b)
	{
		System.out.print("ACCNO:-"+b.accNo+" ");
		System.out.print("NAME:-"+b.name+" ");
		System.out.println(" BAL:-"+b.balance+"  ");
		
		
	}
	
	public void initilize(int a, String b, int c)
	{
		accNo=a; 
		name=b;
		balance=c;
	}
	
	public void withdraw(int amount)
	{
		countWithdraw=amount+countWithdraw;
		balance=balance-amount;
	
	}
	
	public void deposit(int amount)
	{
		countDeposit=amount+countDeposit;
		balance=balance+amount;
	
	}
	public static void displayWithdrawDeposit()
	{
		System.out.println("TOTAL WITHDRAWN MONEY:"+countWithdraw);
		System.out.println("TOTAL DEPOSIT MONEY:"+countDeposit);
		
	}
	
	public static void avgBalance(BankAccounts...v)
	{
		
		int total=0;
		
		for(BankAccounts b:v){
			total=total+b.balance;
		}
		System.out.println("AVERAGE BALANCE : "+(total/v.length));
	}
	
	
	public static void main(String args[])
	{
	BankAccounts b1=new BankAccounts();	
	BankAccounts b2=new BankAccounts();	
	BankAccounts b3=new BankAccounts();	
	BankAccounts b4=new BankAccounts(204,"Pooja",1800);	
	BankAccounts b5=new BankAccounts(205,"Aadi",1500);	
	b1.initilize(201,"Anjali",10000);
	b2.initilize(202,"Ashi",1200);
	b3.initilize(203,"Sadiya",1400);
	System.out.println("ACCOUNT DETAILS");
	b1.showDetails(b1);
	b2.showDetails(b2);
	b3.showDetails(b3);
	b4.showDetails(b4);
	b5.showDetails(b5);
	System.out.println("-----------------------------------------------");
	System.out.println("AFTER DEPOSIT");
	b1.deposit(1000);
	b1.showDetails(b1);
	b2.deposit(1000);
	b2.showDetails(b2);
	System.out.println("-----------------------------------------------");
	System.out.println("AFTER WITHDRAW");
	b2.withdraw(50);
	b2.showDetails(b2);
	b3.withdraw(500);
	b3.showDetails(b3);
	System.out.println("-----------------------------------------------");
	System.out.println("AVERAGE");
	BankAccounts.avgBalance(b1,b2,b3);
	BankAccounts.avgBalance(b1,b2,b3,b4,b5);
	System.out.println("-----------------------------------------------");
	System.out.println("TOTAL DEPOSIT AND WITHDRAW");
	displayWithdrawDeposit();

	
	
	
	
	}	

}
