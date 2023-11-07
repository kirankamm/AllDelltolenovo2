package com.xworkz.showroom.impl;

import java.util.List;

import com.xworkz.showroom.dto.ManagerDTO;

public interface Showroom {
	
	public boolean  addManager(ManagerDTO dto) throws Exception; 	// not body contains
	

		//generic any type data we can add
		 public List<ManagerDTO> getAllManagers();
	
}
