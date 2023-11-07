package com.xworkz.showroom.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.hospital.app.dto.PatientDTO;
import com.xworkz.showroom.dto.ManagerDTO;

public class ShowroomImpl  implements Showroom{

	
	List<ManagerDTO> managers=new  ArrayList<ManagerDTO>();
	
	
	@Override   //method name and parameter are same
	public boolean addManager(ManagerDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside addManager() with ManagerDTO as a parameters");
		boolean isAdded=false;
		
		if(dto !=null && dto.getManagerId() >=1 && dto.getManagerName() !=null) {
			managers.add(dto);  //in dto==all store the data
			isAdded=true;
			
		}
		
		else {
			System.out.println("No managers added");
		}
    return isAdded;		
		
		
	}

	@Override
	public List<ManagerDTO> getAllManagers() {
		// TODO Auto-generated method stub
		List<ManagerDTO> dtos=new ArrayList<ManagerDTO>();
		
		System.out.println("the list of managers  are: ");
		
		Iterator<ManagerDTO> itr=managers.iterator();
		
		
		while(itr.hasNext()) {
			dtos.add(itr.next());
		}
		
		return dtos;
	}

}
