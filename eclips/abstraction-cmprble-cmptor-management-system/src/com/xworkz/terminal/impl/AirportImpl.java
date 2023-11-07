package com.xworkz.terminal.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.terminal.dto.TerminalDTO;

public class AirportImpl implements Airport {

	List<TerminalDTO> terminals=new ArrayList<TerminalDTO>();
	
	@Override
	public boolean addAirport(TerminalDTO dto) {
		// TODO Auto-generated method stub
	System.out.println("Inside the addTerminal with the TermilaDTO");
		boolean isAdded=false;
		
		if(dto !=null && dto.getTerminalID() >=1 && dto.getWorkerName() !=null){
			terminals.add(dto);
		isAdded=true;
		}
		else{
			System.out.println("No Terminals are added");
		}
		return isAdded;
	}

	
	@Override
	public List<TerminalDTO> getAllTerminals() {
		// TODO Auto-generated method stub
		
		List<TerminalDTO> dtos=new ArrayList<TerminalDTO>();
	
		System.out.println("List of all terminals are:");
		
		Iterator<TerminalDTO> itr=terminals.iterator();
		
		while (itr.hasNext()) {
			dtos.add(itr.next());
			
		}
		return dtos;
	}

}
