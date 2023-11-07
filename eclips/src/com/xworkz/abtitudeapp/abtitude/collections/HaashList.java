package com.xworkz.abtitudeapp.abtitude.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HaashList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> fruits = new HashSet<>();

		fruits.add("Banana");
		fruits.add("   Apples");
		fruits.add("Orange");
		fruits.add("Strowberry");
		fruits.add("Strowberry");

		System.out.print(fruits);
		
		 HashMap<Integer, String> studentMap = new HashMap<>();
	        studentMap.put(1, "Alice");
	        studentMap.put(2, "Bob");
	        studentMap.put(3, "Charlie");
	        studentMap.put(4, "David");
	        
	        System.out.print(studentMap);
	        
	        HashMap<Integer, String> studentMap1 = new HashMap<>();
	        studentMap1.put(1, "Dlice");
	        studentMap1.put(2, "cob");
	        studentMap1.put(3, "bharlie");
	        studentMap1.put(4, "aavid");
	        
	        System.out.print(studentMap1);
	        

	}

}
