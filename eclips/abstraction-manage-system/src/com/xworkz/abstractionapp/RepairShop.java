package com.xworkz.abstractionapp;

public class RepairShop {
	
	public static  void repairCar(Brezza brezza) 
	     {
		System.out.println("car is repaired");
		
		 }
	
	public static  void repairCar(Swift swift) 
    {
	System.out.println("car is repaired");
	
	 }

	public static void main(String []args) {

	
		Swift  swift=new Swift();
		
		
		
	
	    repairCar(swift);
	
	}

}
