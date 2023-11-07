package com.xworkz.arrayapp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysBnrSrcCpyEqlCpyRange {

	public static void main(String[] args) {
		
		
		int[] name= {10,12,12,10,15,19,19};
		int[] beStrong= {111,111,123,123,150,150};
		
		long[] soWhat= {88888,66738,546373,66347,5464};
		long[] material= {6575,7584,3242,9871,1014};
		
		long[] laptop= {56,45,37,87,89,90};
		char[] hp= {67,89,90,90,12,14};
		char[] hp1= {67,89,90,90,12,14};

		char[] hp3= {60,89,90,90,12,14};
		char[] hp4= {67,89,90,90,12,14};

		char[] hp5= {6743,8964,90,90,12,14};

		
		
		
		System.out.println(Arrays.binarySearch(beStrong, 3));
		
		System.out.println(Arrays.binarySearch(name, 3));
		
		System.out.println(Arrays.copyOf(hp, 5));
         
		System.out.println(Arrays.equals(hp, hp1));
		
		System.out.println(Arrays.equals(hp3, hp4));
		
		System.out.println(Arrays.copyOfRange(hp4, 0, 2));

		
		
		
		
	}
}
