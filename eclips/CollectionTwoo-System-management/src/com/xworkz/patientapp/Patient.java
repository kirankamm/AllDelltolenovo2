package com.xworkz.patientapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor//purpose=public Patient( String patientName,int patientId,int age,int contactNo,String place) {} 
@NoArgsConstructor

public class Patient {

	private String patientName;
	private int patientId;
	private int age;
	private int contactNo;
	private String place;

	
	
	
	@Override
	public String toString() {
			
	return"Patient (patientName="+this.patientName+",patientId="+this.patientId+",age="+this.age+","
			+ "contactNo="+this.contactNo+",place="+this.place+")";
	}	
}
