package com.xworkz.showroom.comparator;

import java.util.Comparator;

import com.xworkz.showroom.dto.ManagerDTO;

public class AddresComparator implements Comparator<ManagerDTO> {

	@Override
	public int compare(ManagerDTO o1, ManagerDTO o2) {
		// TODO Auto-generated method stub
		return o1.getAddres().compareTo(o2.getAddres());
	}

	
}
