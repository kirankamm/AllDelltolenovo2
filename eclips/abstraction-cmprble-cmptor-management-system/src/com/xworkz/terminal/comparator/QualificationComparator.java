package com.xworkz.terminal.comparator;

import java.util.Comparator;

import com.xworkz.terminal.dto.TerminalDTO;

public class QualificationComparator implements Comparator<TerminalDTO> {

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		// TODO Auto-generated method stub
		return o1.getQualification().compareTo(o2.getQualification());
	}

	
	
}
