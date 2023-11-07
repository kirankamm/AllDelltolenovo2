package com.xworkz.hospital.app.comparator;

import java.util.Comparator;

import com.xworkz.hospital.app.dto.PatientDTO;

public class PatientIdComparator implements Comparator<PatientDTO>{ 

	@Override //name and para == same
	public int compare(PatientDTO o1, PatientDTO o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
		
	}
}



/*
 	public int compareTo(PatientDTO o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}

 */







