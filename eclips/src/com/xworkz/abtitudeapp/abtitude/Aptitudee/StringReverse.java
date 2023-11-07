package com.xworkz.abtitudeapp.abtitude.Aptitudee;

public class StringReverse {

	public static void main(String[] args) {
		
		 String name="kiran";
		
		 
	    char []reverse =new  char[name.length()];
		int length =name.length()-1;
	
		for(int i=0;i<=length;i++) {
			
			reverse[i]=name.charAt(length-i);
		}
		System.out.println(String.valueOf(reverse).toLowerCase());
		
		
		
	}
	
	
}
