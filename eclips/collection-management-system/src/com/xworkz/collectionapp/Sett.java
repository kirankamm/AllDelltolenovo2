package com.xworkz.collectionapp;

import java.util.Set;
import java.util.TreeSet;

public class Sett {

	public static void main(String[] args) {
		
	Set setRef =new TreeSet();
	
	//TreeSet== internally use treeBlackValue	
	//compare data

	setRef.add("a");
	
	setRef.add("name");
    
	setRef.add("name");
	setRef.add("kiran");
	setRef.add("123");
	setRef.add("123");
	setRef.add("234");
	

	//list.add(null); // TreeSet null value its not taken
	
	//hashset not compare with data or variable
	System.out.println(setRef);
	}
}
