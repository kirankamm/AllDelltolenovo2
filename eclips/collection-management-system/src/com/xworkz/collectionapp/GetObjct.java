package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;

public class GetObjct {

public static void main(String[] args) {
		
		List list=new ArrayList();
		//ArrayList,vector,LinkedList,stack=it method function we ca use
		//only of this 
		

		   list.add(null);

		   list.add(null);

		   list.add(null);
		   list.add(0,"subjecte");  //index in output come 0,1,2,3// 
		   list.add(1,"sun");
           list.add(2,"moon");
		   list.add(4,"arya");   //if index incremental value only we written all in one side taken output not  exception  

		   System.out.println(list);
		
		   System.out.println(list.get(3));
		   System.out.println(list.get(0));
		   System.out.println(list.get(1));
		   System.out.println(list.get(2));
		   System.out.println(list.get(3));
		   System.out.println(list.get(4));
		   System.out.println(list.get(5));

		   for (Object obj:list) {
	  // list.add(1); run time ocures ..java.util.ConcurrentModificationException
			   System.out.print(obj +", ");
			   
		   }
		   
		   //create two list
		   
		   //add them
		   
		   }
	
}
