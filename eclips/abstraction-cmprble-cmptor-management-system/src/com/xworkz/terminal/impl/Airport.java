package com.xworkz.terminal.impl;

import java.util.List;

import com.xworkz.terminal.dto.TerminalDTO;

public interface Airport {

	public boolean addAirport(TerminalDTO dto);

	
	public List<TerminalDTO> getAllTerminals();
	
}
