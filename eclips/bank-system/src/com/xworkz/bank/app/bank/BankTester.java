package com.xworkz.bank.app.bank;

import java.util.Scanner;

public class BankTester {


public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter size");
	int size =sc.nextInt();
	Bank bank = new Bank(size);
	for(int i=0; i<size; i++)
	{
	

	System.out.println("please enter the name");
	String name = sc.next();
	
	System.out.println("please enter contacteNo");
	long contactNo = sc.nextLong();
	
	System.out.println("please enter accountId");
	int accounId=sc.nextInt();
	
	System.out.println("please enter accountNo");
	long accountNo=sc.nextLong();
	
	
	Customer customer=new Customer(name,accounId,accountNo,contactNo);
	bank.saveDetails(customer);}
	
	bank.getDetails();
	
	System.out.println("please enter accountId to get details");
	int accountId=sc.nextInt();
	bank.getById(accountId);
	
	System.out.println("please enter accountId to update details");
	int accountId1=sc.nextInt();
	
	System.out.println("please enter newnumber to update details");
	long newContactNo=sc.nextLong();
	
	bank.updateContactNoByAccountId(newContactNo,accountId1);
	
		
}	
	
}
