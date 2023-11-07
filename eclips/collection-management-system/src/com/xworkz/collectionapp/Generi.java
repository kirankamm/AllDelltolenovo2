package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generi {
	
	public static void main(String[] args) {
		//specific purpose only string,intiger
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(12);
		l1.add(544);
		
		for(Object obje:l1) {
			System.out.println(l1);
		}
		
		Iterator<Integer> itr= l1.iterator();
		
		
		while(itr.hasNext()) {
			Object l11=itr.next();
			
			System.out.println(l11);
		}
		System.out.println(l1.size());

	}

}
