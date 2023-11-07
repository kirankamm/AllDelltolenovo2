package com.xworkz.bank.app.bank;

public class Bank {
	
	Customer customer [];
	int i;
	
	public Bank(int size) {
		customer = new Customer[size];
	}

	public void saveDetails(Customer customer) {
		//boolean isAdded=false;
		if(customer.getName() !=null  &&  customer.getName()!="") {
			  this.customer[i++]=customer;
			  //is Added=true;
			  
		}
		return;}

	
	public void getDetails() {
		for (int i=0; i<customer.length;i++) {  
		System.out.println(customer[i].getName()+" "+customer[i].getAccountId()+" "+customer[i].getAccountNo()+" "+customer[i].getContactNo());                 
		}
		
		}
	
		public Customer getById(int accountId) {
			for (int i=0;i<customer.length;i++) {
	System.out.println(customer[i]);			
	if(customer[i].getAccountId() == accountId) {
System.out.println(customer[i].getName()+" "+customer[i].getAccountId()+" "+customer[i].getAccountNo()+" "+customer[i].getContactNo());
					
				}
				}
			return null;
			}
		
		public int updateContactNoByAccountId(long newContactNo,int accountId) {
		
		System.out.println("updateContactNoByAccountId started ");	
			for(int i=0; i <customer.length;i++) {
				if(customer[i].getAccountId() == accountId) {
					System.out.println("The Current ContactNo is"+customer[i].getContactNo());			
					customer[i].setContactNo(newContactNo);
					System.out.println("The Update ContactNo is"+customer[i].getContactNo());
				}
			}
			return 0;
					
					
					
				}
		
		}
		
		

