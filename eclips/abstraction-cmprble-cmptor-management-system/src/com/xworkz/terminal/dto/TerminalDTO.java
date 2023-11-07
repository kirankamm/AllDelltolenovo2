package com.xworkz.terminal.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TerminalDTO implements Serializable,Comparable<TerminalDTO> {

	public int terminalID;
	public String terminalName;
	public String workerName;
	public int workerContactNo;
	public String qualification;
	public String gender;
	
	
	@Override
	public int compareTo(TerminalDTO o) {
		// TODO Auto-generated method stub
		return this.terminalID-o.terminalID;
	}

	
}
