package com.xworkz.patientapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.customerapp.Customer;

public class PatientTester {

	public static void main(String[] args) {
		
		List<Patient> patientRef1=new ArrayList<Patient>();
		
		patientRef1.add(new Patient("kiarn",183,25,7795,"Benglore") );
		patientRef1.add(new Patient("charan",143,26,8884,"Manglore") );


		//Collections.sort(patientRef1);
		//Collections.sort(patientRef1, new patientRef1());
		
		//Iterator<Patient> itrRef1=patientRef1.iterator();
		
		//Collections.sort((List<T>) patientRef1);

		Collections.sort(patientRef1);
		//Collections.sort(customersRef, new NameComparator());
		
		
		for(Customer objRef:patientRef1 ) {
			System.out.println(objRef);
		}
		
		
	}
}
