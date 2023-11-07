package com.xworkz.platform;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Platform implements Comparable<Platform>{

	private String platformName;
	private int pltformCapcity;
	private int platformId;
	private int plateformNo;
	private int plateformPrice;
	

	
	@Override
	public String toString() {
		
return "(platformName="+this.platformName+",pltformCapcity="+pltformCapcity+",platformId="+platformId+",plateformNo="+plateformNo+",plateformPrice="+plateformPrice+")" ;
	}



@Override
public int compareTo(Platform o) {
	// TODO Auto-generated method stub
	return this.plateformNo- o.plateformNo;
}



}
