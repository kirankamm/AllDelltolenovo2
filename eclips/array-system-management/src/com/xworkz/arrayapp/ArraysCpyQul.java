package com.xworkz.arrayapp;

import java.util.Arrays;

public class ArraysCpyQul {
@Override
	
protected void finalize () throws Throwable{
	
	System.out.println("the finalize is used to clean objecte in the heap memory ");
	
	
}

	public static void main(String[] args) {
		

		ArraysCpyQul arrayFive=new ArraysCpyQul();
		
	System.gc();
	
	ArraysCpyQul  arrayFive1=new ArraysCpyQul();
	
	arrayFive=arrayFive1;
	
	System.gc();
		
		
		
		
        int[] member1= {122,566,677,899,899,788,977,566};
		
		int[] member2= {122,566,677,899,899,788,977,566};
		
	    int[] price= {99,45,45,63,63,78,12};
	    
		int[] salary= {7,8,10,10,9,9,5,58};
		
		long[] book= {1234,4356,64748,8436354,846465};
		
		long[] pen= {856574,754635,754635,9450598};
		

		long[] students= {657385473,64738239,64838329,546367,746465};
		
		long[] collage= {657385473,64738239,64838329,546367,746465};
		
		
		System.out.println("start");

		System.out.println(Arrays.copyOf(salary,7));
		

		System.out.println(Arrays.equals(book,pen));
		
		System.out.println(Arrays.equals(member1,member2));
		
		System.out.println(Arrays.equals(price,price));
		
		System.out.println(Arrays.equals(book, pen));


		System.out.println(Arrays.equals(students, collage));

		System.out.println("end");

		
		
		
	}
}
