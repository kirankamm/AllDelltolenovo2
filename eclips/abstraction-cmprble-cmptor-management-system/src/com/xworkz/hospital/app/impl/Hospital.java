package com.xworkz.hospital.app.impl;

import java.util.List;

import com.xworkz.hospital.app.dto.PatientDTO;

public interface Hospital {
	
	public boolean  addPatient(PatientDTO dto) throws Exception;
	
	// not body contains
		
		 public List<PatientDTO> getAllPatients();
	
}
