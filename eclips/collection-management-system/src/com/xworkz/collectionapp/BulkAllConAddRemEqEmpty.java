package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class BulkAllConAddRemEqEmpty {



	public static void main(String[] args) {

	List list=new ArrayList();	
	
	list.add("hide");		
	list.add("rading");
	list.add("collectionns");
	list.add("exception");
	list.add("inheritance");
	list.add("polymorphisum");
	list.add("interface");
    list.add("156");
	list.add("5432");
	list.add("5343");


	List list1=new Stack();
	
	list1.add("class");
	list1.add("method");
	list1.add("java");
	list1.add("vartual");
	list1.add("machine");
	list1.add("develoments");
	list1.add("67478");
	list1.add("7869");
	list1.add("987");
	list1.add("6543");
	list1.add("173547");
	list1.add("7468239");
	list1.add("7483684");
	
	
	
	System.out.println(list.hashCode());
	System.out.println(list1.hashCode());

	
	System.out.println(list1.equals(list));
	System.out.println(list1.equals(list1));
	
	System.out.println(list1.isEmpty());
	System.out.println(list.isEmpty());


	
	System.out.println(list.containsAll(list1));
	System.out.println(list1.containsAll(list));
	
	System.out.println(list.addAll(list1));
	System.out.println(list1.addAll(list));
	
	System.out.println(list.addAll(0,list1));
	System.out.println(list.addAll(1,list1));
	System.out.println(list.addAll(2,list1));
	
	System.out.println(list.addAll(3,list1));


    System.out.println(list1);

    
   

for(Object  obj:list) {
	
	System.out.println(obj);
}
	
Iterator itr=list.iterator();

while(itr.hasNext()) {
	Object obj2=itr.next();
	System.out.println(obj2);

}

System.out.println(list.size());
System.out.println(list1.removeAll(list));

	}

}
