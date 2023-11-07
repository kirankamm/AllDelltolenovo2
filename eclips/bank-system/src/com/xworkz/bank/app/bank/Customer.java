package com.xworkz.bank.app.bank;

public class Customer {
	
	private String name;
	private int accountId;
	private long accountNo;
	private long contactNo;

	
	public Customer() {
	}
	public Customer(String name,int accountId,long accountNo,long contactNo) {
				
		this.name = name;
		this.accountId = accountId;
		this.accountNo = accountNo;
		this.contactNo = contactNo;
			
			}
		public void setName(String name) {
			this.name=name;
		}
		public String getName(){
		return name;
		}
		
		                                                      
		public void setAccountId(int accountId){
			this.accountId=accountId;
		}
		public int getAccountId() {
			return accountId;
		}
		
		
		public void setAccountNo(long accountNo) {
		 this.accountNo=accountNo;
		}
		
		public long getAccountNo() {
		return accountNo;
	    }
			
		public void setContactNo(long contactNo ) 
		{
		this.contactNo = contactNo;
		}
		
		public long getContactNo(){
		return contactNo;
			
}
	}
