package com.xworkz.arrayapp;

import java.util.Arrays;

public class ArraysToSringEul {

	public static void main(String[] args) {
		
		
		int[] member1= {1,2,3,4,5,6};
		int[] member2= {6,8,9,10,11,12};
		int[] member3= {12,14,15,16,17};
		int[] member4= {12,14,15,16,17};
		int[] member5= {12,14,15,16,17};
		int[] price= {19,14,15,16,17,19};

		
		for(int i:member1) {
			
			System.out.println(i);

		}
		
		System.out.println("Arrays method");
		System.out.println("Arrays.toString(member1)"+" = "+Arrays.toString(member1));
		System.out.println("Arrays.toString(member2)"+" = "+Arrays.toString(member2));
		System.out.println("Arrays.toString(member3)"+" = "+Arrays.toString(member3));
		
		/*System.out.println("Sorted arrays");*/
		
		//Arrays.sort(member2);
		System.out.println("Arrays.equals(member4, member5)"+" this ans is = "+Arrays.equals(member4, member5));
		System.out.println("Arrays.binarySearch(member2, 12)"+" this ans is give the possistion of num = "+ Arrays.binarySearch(member2, 12));
	/*	System.out.println("Arrays.compare(member1,member2)"+" this ans  = "+ Arrays.compare(member1,member2));*/

		Arrays.parallelSort(price);
		
		
		System.out.println("Arrays.toString(price)  ans is incresing order  = "+ Arrays.toString(price));
		
		int newArray[]=Arrays.copyOf(member4, 12);
		
		System.out.println("Arrays.toString(newArray) = "+ Arrays.toString(newArray));
		
		
		
		
	}
	
}
