package com.xworkz.managerapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerTester {
	
public static void main(String[] args) {
	
	List<Manager> listRef=new ArrayList<Manager>();
	
	listRef.add(new Manager("sagari",1234,8884642500l,25,"MBA") );
	listRef.add(new Manager("akshay",678,7795656468l,26,"MCA"));
	System.out.println("List of managers");
	
	Collections.sort(listRef);
	//Collections.sort(listRef, new NameComparator());
	
	for(Object objRef:listRef) {
		System.out.println(objRef);
	}
	
	
	
	
}
}
