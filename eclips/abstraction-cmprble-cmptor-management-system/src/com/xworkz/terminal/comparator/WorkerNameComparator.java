package com.xworkz.terminal.comparator;

import java.util.Comparator;

import com.xworkz.terminal.dto.TerminalDTO;

public class WorkerNameComparator implements Comparator<TerminalDTO> {

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		// TODO Auto-generated method stub
		return o1.getWorkerName().compareTo(o2.getWorkerName());
	}

}
