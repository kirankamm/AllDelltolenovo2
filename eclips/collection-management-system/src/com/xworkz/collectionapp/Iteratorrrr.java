package com.xworkz.collectionapp;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iteratorrrr {

	public static void main(String[] args) {
		
	/*	
	 * Object obj=new Object();
	
		Object obj1=null;
		
		System.out.println(obj1==null);
		
	Objecte obj=null;
	System.out.println(new Objecte()=null);
	*/
		
	Queue set=new PriorityQueue();
	
	set.add("git");
	set.add("Jira");
	set.add("Amar");
	
	
	
	
	System.out.println("fecthing the data using for each");
	for(Object obj:set) {
		System.out.println(obj);
		}

	
	System.out.println("fecth the data using for itarator");
    java.util.Iterator itr=set.iterator();



while(itr.hasNext()) {
	
	
	String dataFromSet=(String)itr.next();
	System.out.println(dataFromSet);
	
	System.out.println("The size of collection after using remove is "+set.size());
	
	/*
	 * //homoginus type and type safty this  ..... <>-generics  
	// List(String) list=new ArrayList<String>();
	 * */
	
	
		
		
	}
		
	
	
}
	}

