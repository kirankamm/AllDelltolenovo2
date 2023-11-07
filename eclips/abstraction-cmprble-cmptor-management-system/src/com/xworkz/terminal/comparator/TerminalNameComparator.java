package com.xworkz.terminal.comparator;

import java.util.Comparator;

import com.xworkz.terminal.dto.TerminalDTO;

public class TerminalNameComparator implements Comparator<TerminalDTO> {

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		// TODO Auto-generated method stub
		return o1.terminalName.compareTo(o2.terminalName);
	}

}
