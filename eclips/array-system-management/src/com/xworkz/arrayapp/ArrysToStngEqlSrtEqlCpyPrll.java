package com.xworkz.arrayapp;

import java.util.Arrays;

public class ArrysToStngEqlSrtEqlCpyPrll {

	
	public static void main(String[] args) {

		
		
		int[] member4= {122,566,677,899,899,788,977,566};
		
		int[] member5= {122,566,677,899,899,788,977,566};
		
		int[] price= {99,45,45,63,63,78,12};

		
		int[] member2= {7,8,10,10,9,9,5,58};
		
		int[] member3= {45,73,88,90,12};
		
			int[] member1= {31,31,32,31,45,67};
			
			for(int i:member1) {
				
				System.out.println(i);

			}
			
			System.out.println("start");

			int newArray[]=Arrays.copyOf(member4, 12);
			
			System.out.println("Arrays.toString(newArray) = "+ Arrays.toString(newArray));
			
			
			System.out.println("Arrays.toString(member3)"+" = "+Arrays.toString(member3));
			
			
			System.out.println("Arrays.equals(member4, member5)"+" this ans is = "+Arrays.equals(member4, member5));
			
			System.out.println("Arrays method");
			
			System.out.println("Arrays.toString(member1)"+" = "+Arrays.toString(member1));
			
			
			System.out.println("Arrays.toString(member2)"+" = "+Arrays.toString(member2));
			
			System.out.println("Arrays.binarySearch(member2, 12)"+" this ans is give the possistion of num = "+ Arrays.binarySearch(member2, 12));

			Arrays.parallelSort(price);
			
			
			System.out.println("Arrays.toString(price)  ans is incresing order  = "+ Arrays.toString(price));
		
			
			System.out.println("end");
		
	}

}
