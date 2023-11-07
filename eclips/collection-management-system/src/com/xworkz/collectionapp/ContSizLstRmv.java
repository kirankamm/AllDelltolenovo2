package com.xworkz.collectionapp;


//its come from java.util class
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ContSizLstRmv {

	public static void main(String[] args) {
		
	Collection list=new ArrayList();
	
	list.add("babu");
	list.add("zebra");
	list.add("aane");
	list.add("viman");
	list.add("60");
	
	
	System.out.println(list.contains("kiran"));
	System.out.println("the size of the before  using removing "+list.size());
	System.out.println(list);

	System.out.println(list.remove("babu"));
	//string long int   10exa remove size empy r not
	System.out.println("the size of the after  using removing "+ list.size());
	System.out.println(list);

	
	System.out.println("fecthing the data using for each");
    for(Object obj: list) {
		System.out.println(obj);
		
	}
	
	
	System.out.println("fecth the data using for itarator");
	
	java.util.Iterator itr=list.iterator();
	
	while(itr.hasNext()) {
		
		Object dataFromList=itr.next();
		System.out.println(dataFromList);
			
	}
	System.out.println("The size of collection after using remove is"+list.size());
	
		
}
}


