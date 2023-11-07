package com.xworkz.hospital.app.tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.xworkz.hospital.app.comparator.PatientIdComparator;
import com.xworkz.hospital.app.constant.Gender;
import com.xworkz.hospital.app.dto.PatientDTO;
import com.xworkz.hospital.app.impl.Hospital;
import com.xworkz.hospital.app.impl.HospitalImpl;

public class HospitalTester {
public static void main(String[] args) {
	

	Scanner sc=null;
	try {
	sc=new Scanner(System.in);
		
	Hospital hospital=new HospitalImpl();

	 for (int i=0; i< 2; i++) {
		
		/*  HospitalImpl
			PatientDTO
			getPatientName
			getPatientId 
			
			public int patientId;
	public String patientName;
	public String bloodGroup;
	public String gender;
	public int age;
	public int setPatientId;
	*/
	
	
		 PatientDTO dto=new PatientDTO();
		 
    System.out.println("Enter the patientName");
    dto.setPatientName(sc.next());
	
	System.out.println("Enter the salesPersonId");
    dto.setPatientId(sc.nextInt());
	
	System.out.println("Enter the gender");
    dto.setGender(Gender.valueOf(sc.next()));
	

	
	System.out.println("Enter the age");
    dto.setAge(sc.nextInt());
	
	System.out.println("Enter the bloodGroup");
    dto.setBloodGroup(sc.next());
    
	 } 
	List<PatientDTO> persons =hospital.getAllPatients();
	
	Collections.sort(persons, new PatientIdComparator());
	System.out.println( persons);

	
}catch (Exception e) {
	e.printStackTrace();
}finally {
	if(sc !=null) {
		sc.close();
}
}
}
	
}

