package com.xworkz.abtitudeapp.abtitude.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();

		names.add("kiran");
		names.add("Shiva");

		
	      Collections.sort(names);
	      
	      for(String namess:names) {
	    	  
	    	  System.out.println(namess);  
	      }
	      
	      

	}

}
