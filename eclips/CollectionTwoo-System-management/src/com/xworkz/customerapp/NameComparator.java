package com.xworkz.customerapp;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return  ((Customer) o1.getName()).compareTo((Customer) o2.getName());
	}

}
