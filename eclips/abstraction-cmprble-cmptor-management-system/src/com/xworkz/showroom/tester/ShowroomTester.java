package com.xworkz.showroom.tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.xworkz.showroom.dto.ManagerDTO;
import com.xworkz.showroom.impl.Showroom;
import com.xworkz.showroom.impl.ShowroomImpl;

public class ShowroomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=null;
		try {
		sc=new Scanner(System.in);
			
		Showroom showroom=new ShowroomImpl();

		 for (int i=0; i< 2; i++) {
			
		
			 ManagerDTO dto=new ManagerDTO();

		 
		System.out.println("Enter the Manager Id");
		int manegerId= sc.nextInt();   
		
		
		System.out.println("Enter the Manager Contact No");
		long contactNo = sc.nextLong();
		
		System.out.println("Enter the Manager Name");
		String managerName=sc.next();
		
		System.out.println("Enter the Manager Address");
		String address=sc.next();
		
		System.out.println("Enter the Manager Qualification");
		String managerQualification=sc.next();
		
		System.out.println("Enter the Manager Gender");
		String gender=sc.next();
		
		
	 } 
	List<ManagerDTO> persons =showroom.getAllManagers();
	
	Collections.sort(persons, new ManagerIdComparator());
	System.out.println( persons);

	
}catch (Exception e) {
	e.printStackTrace();
}finally {
	if(sc !=null) {
		sc.close();
}
}
}
	
	}


