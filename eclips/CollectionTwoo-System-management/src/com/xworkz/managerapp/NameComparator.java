package com.xworkz.managerapp;

import java.util.Comparator;

public class NameComparator implements Comparator<Manager>{

	@Override
	public int compare(Manager o1, Manager o2) {
		// TODO Auto-generated method stub
		return o1.getManagerName().compareTo(o2.getManagerName());
	}

}
