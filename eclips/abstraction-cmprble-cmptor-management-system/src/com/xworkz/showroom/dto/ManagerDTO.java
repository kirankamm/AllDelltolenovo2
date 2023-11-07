package com.xworkz.showroom.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ManagerDTO implements Serializable,Comparable<ManagerDTO> {

	
	private int managerId;
	private String managerName;
	private String addres;
	private String qualification;
	private long contactNo;
	private String gender;
	
	@Override
	public int compareTo(ManagerDTO o) {
		// TODO Auto-generated method stub
		return this.managerId-o.managerId;
	}
	
	
	
}
