package com.xworkz.hospital.app.comparator;

import java.util.Comparator;

import com.xworkz.hospital.app.dto.PatientDTO;

public class PatientNameComparator implements  Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {
		// TODO Auto-generated method stub
		return o1.patientName.compareTo(o2.patientName);
	}

}
