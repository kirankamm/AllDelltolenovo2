package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class BulkAllConAddRemHasEqEmpt {

	public static void main(String[] args) {

		
		Collection list=new ArrayList();	
		
		list.add("collectionn");		
		list.add("mainn");
		list.add("add");
		list.add("Overloading");
		list.add("publicc");
		list.add("staticc");
		list.add("143");
	    list.add("758");
		list.add("2471994");
		list.add("27419994");


		Collection list1=new Stack();
		
		list1.add("ooopps");
		list1.add("class");
		list1.add("throwss");
		list1.add("cotainalll");
		list1.add("stackk");
		list1.add("vectorr");
		list1.add("735634");
		list1.add("415258");
		list1.add("987433");
		list1.add("876");
		list1.add("976");
		list1.add("835645");
		list1.add("354578");
		

		
		System.out.println(list.containsAll(list1));
		System.out.println(list1.containsAll(list));
		
		
		
		System.out.println(list.addAll(list1));
		System.out.println(list1.addAll(list));
		
		
		
		System.out.println(list.removeAll(list1));
		
		
		System.out.println(list.hashCode());
		System.out.println(list1.hashCode());

		
		
		
		System.out.println(list1.equals(list));
		System.out.println(list1.equals(list1));
		
		
		
		System.out.println(list1.isEmpty());
		System.out.println(list.isEmpty());
		
		
		System.out.println("fecthing the data using for each");
	    for(Object obj: list) {
			System.out.println(obj);	
		}
	    
	   // Iterator==for fetch//
		
		System.out.println("fecth the data using for itarator");
		
		java.util.Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			
			Object dataFromList=itr.next();
			
			System.out.println(dataFromList);
				
		}
		System.out.println("The size of collection after using remove is"+list.size());
		
						
		}
}
