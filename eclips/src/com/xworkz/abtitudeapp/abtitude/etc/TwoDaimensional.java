package com.xworkz.abtitudeapp.abtitude;

public class TwoDaimensional {

	
	public static void main(String[] args) {
		
		
		int twod[][] = {{12,34,5,3,4,78},{12,25,10,37,59}};
		
		for(int i=0; i<twod.length; i++) {//i<twod.length  or i<5//
			
			System.out.println("length of  first array"+twod[i].length);
			
			for (int j=0; j<5; j++) {
			System.out.println(twod[i][j]);	
			}
					
		}
		
		
	}
}
