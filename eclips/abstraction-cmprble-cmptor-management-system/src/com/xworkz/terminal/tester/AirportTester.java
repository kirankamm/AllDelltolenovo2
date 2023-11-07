package com.xworkz.terminal.tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.xworkz.terminal.dto.TerminalDTO;
import com.xworkz.terminal.impl.Airport;
import com.xworkz.terminal.impl.AirportImpl;

public class AirportTester {

	public static void main(String[] args) {
		
	
	
	Scanner sc= null;
	try {
	sc=new Scanner(System.in);
		
	Airport airport=new AirportImpl();

	 for (int i=0; i< 2; i++) {
		

		 TerminalDTO dto=new TerminalDTO();

	 
	System.out.println("Enter the TerminalId");
	int TerminalId= sc.nextInt();   
	
	
	System.out.println("Enter the terminalName");
	String terminalName = sc.next();
	
	System.out.println("Enter the workerName");
	String workerName=sc.next();
	
	System.out.println("Enter the workerContactNo");
	int workerContactNo=sc.nextInt();
	
	System.out.println("Enter the Qualification");
	String Qualification=sc.next();
	
	System.out.println("Enter the Qualification");
    dto.setQualification(Qualification.valueOf(sc.next()));
	
	System.out.println("Enter the Location");
	String Location=sc.next();
	
	
 }
	 
List<TerminalDTO> persons =airport.getAllTerminals();

Collections.sort(persons, new TerminalNameComparator());
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
