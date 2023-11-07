package com.xworkz.hospital.app.impl;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.hospital.app.dto.PatientDTO;



public class HospitalImpl implements Hospital{

	
	List<PatientDTO> patients;
	
	public HospitalImpl() {
		
		patients =new ArrayList<PatientDTO>();
	}
	
	
	@Override
	public boolean addPatient(PatientDTO dto) throws Exception {
		
		System.out.println("Inside addPatient() with PatientDTO as a parameters");
		boolean isAdded=false;
		
		if(dto !=null && dto.getPatientId() >=1 && dto.getPatientName() !=null) {
			patients.add(dto);  //in dto==all store the data
			isAdded=true;
			
		}
		
		else {
			System.out.println("No patients added");
		}
    return isAdded;		
	}
	
	
	@Override
	public List<PatientDTO> getAllPatients(){
		
		List<PatientDTO> dtos=new ArrayList<PatientDTO>();
		
		System.out.println("the list of patients  are: ");
		
		Iterator<PatientDTO> itr=patients.iterator();
		
		
		while(itr.hasNext()) {
			dtos.add(itr.next());
		}
		
		return dtos;
	}
	
}
