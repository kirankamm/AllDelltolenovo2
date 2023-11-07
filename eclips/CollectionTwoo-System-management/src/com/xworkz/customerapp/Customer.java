package com.xworkz.customerapp;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor//Default Constructor ==purpose
@AllArgsConstructor //variable has to take automatic
@ToString

public class Customer implements Comparable<Customer> {

    private String customerName;
	private int customerId;
	private int customerMobileNo;
	private String customerPlace;
	private int customerAge;


	

	
	//when we are creating @override we do not necessary create class of Id
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.customerId-o.customerId;
	}

	
	
	
	
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	}
