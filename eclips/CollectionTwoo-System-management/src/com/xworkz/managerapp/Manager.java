package com.xworkz.managerapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Manager implements Comparable<Manager> {

	private String managerName;
	private int managerId;
	private long managerContactNo;
	private int managerAge;
	private String managerQualification;
	
	
	@Override
	public String toString() {
		return "Manager(managerName="+this.managerName+",managerId="+this.managerId+",managerContactNo="+this.managerContactNo+",managerAge="+this.managerAge+",managerQualification="+this.managerQualification+")";
		
	}
	
	
	

	@Override
	public int compareTo(Manager o) {
		// TODO Auto-generated method stub
		return this.managerId-o.managerId;
	}


	public Manager getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
