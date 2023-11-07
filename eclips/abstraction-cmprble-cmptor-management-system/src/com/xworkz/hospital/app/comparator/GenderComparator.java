package com.xworkz.hospital.app.comparator;

import java.util.Comparator;

import com.xworkz.hospital.app.dto.PatientDTO;

public class GenderComparator implements Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {
		// TODO Auto-generated method stub
		return o1.gender.compareTo(o2.gender );
	}

}
