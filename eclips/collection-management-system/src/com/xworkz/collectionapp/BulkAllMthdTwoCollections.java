package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class BulkAllMthdTwoCollections {

	public static void main(String[] args) {

	Collection list=new ArrayList();	
	
	list.add("lombok");		
	list.add("arrayy");
	list.add("tostringg");
	list.add("override");
	list.add("variable");
	list.add("polymorphisum");
	list.add("123");
    list.add("156");
	list.add("5432");
	list.add("5343");


	Collection list1=new Stack();
	
	list1.add("method");
	list1.add("static");
	list1.add("data");
	list1.add("type");
	list1.add("throw");
	list1.add("english");
	list1.add("67478");
	list1.add("7869");
	list1.add("987");
	list1.add("6543");
	list1.add("173547");
	list1.add("7468239");
	list1.add("7483684");
	

	
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


	

		
	}

}
