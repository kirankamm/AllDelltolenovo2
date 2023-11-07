package com.xworkz.platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class platformTester {

	public static void main(String[] args) {
		
		List<Platform> listRef=new ArrayList<Platform>();
	
		listRef.add(new Platform ("kempeGouda",200,1,2,200));
		listRef.add(new Platform ("Rani Channamma",300,2,3,300));
		listRef.add(new Platform ("sangolli Rayanna",400,3,4,400));

		//Collections.sort(listRef);
		Collections.sort(listRef,new plateformNoComparator());
		
	     for(Object objRef:listRef) {
		 System.out.println(objRef);
		 
	 }
		
		
	}
}
