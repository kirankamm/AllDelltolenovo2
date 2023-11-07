package com.xworkz.hospital.app.dto;

import java.io.Serializable;
import java.util.Comparator;

import com.xworkz.hospital.app.constant.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PatientDTO implements Serializable,Comparable<PatientDTO> {

	// Comparable== int 
	// Comparator== String or Int
	
	public int patientId;
	public String patientName;
	public String bloodGroup;
	public String gender;
	public int age;
	

	@Override
	public int compareTo(PatientDTO o) {
		// TODO Auto-generated method stub
		return this.patientId-o.patientId;
	}

	public void setGender(Gender valueOf) {
		// TODO Auto-generated method stub
		
	}
	

	
	/*	@Override
	public int compare(SalesPersonDTO o1, SalesPersonDTO o2) {
		// TODO Auto-generated method stub
		return o1.getPersonName.compare();
	}*/
}
