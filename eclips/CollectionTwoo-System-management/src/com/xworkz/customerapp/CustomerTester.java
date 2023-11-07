package com.xworkz.customerapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.Object;

import com.xworkz.customerapp.Customer;

public class CustomerTester {

	public static void main(String[] args) {
	
		List<Customer> customersRef=new ArrayList<Customer>();
		
		
		//Declaration
		customersRef.add(new Customer("kiran",1,779565,"Belegavi",25));
		customersRef.add(new Customer("Shreepad",2,88846,"Bijapur",26));

		
		//Collections.sort(customersRef);
		Collections.sort(customersRef, new NameComparator());
		
		
		for(Customer objRef:customersRef ) {
			System.out.println(objRef);
		}
		
		/*//Fetch data=Iterator
		Iterator<Customer> itr=customersRef.iterator();  //to call
		
		while(itr.hasNext()) {
		Customer customerRef2=itr.next();
		
		System.out.println(customerRef2);*/
	
		 
	}
	}

