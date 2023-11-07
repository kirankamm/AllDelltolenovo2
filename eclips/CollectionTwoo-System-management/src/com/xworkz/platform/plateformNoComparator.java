package com.xworkz.platform;

import java.util.Comparator;

public class plateformNoComparator implements Comparator<Platform> {

	@Override
	public int compare(Platform o1, Platform o2) {
		// TODO Auto-generated method stub
		return o1.getPlateformNo().compareTo(o2.getPlateformNo());
	}

}
