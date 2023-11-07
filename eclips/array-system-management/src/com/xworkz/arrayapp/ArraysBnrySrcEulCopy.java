package com.xworkz.arrayapp;

import java.util.Arrays;

public class ArraysBnrySrcEulCopy {

	public static void main(String[] args) {
		
	
	long[] member1= {1000000,20,20,10,30,40};
    long[] member2=  {1000000,20,20,10,30,40};
    char[]  member3= {12,12,13,14,15,16,17};
    char[]  member4= {19,20,21,22,23,34,78};
    int[] m5= {99,100,101,102,107,100};
    int[] m6= {99,101,199,232,456,99};
    int[] m7= {99,101,199,232,456,156};
 

	
	for(int i:m5) {
		
		System.out.println(i);

	}
    
	//System.out.println(Arrays.binarySearch(member1, 4, 2, 3));
	//Arrays.binarySearch(member1, 3);

  System.out.println(Arrays.binarySearch(member2, 30)); 
  
  
System.out.println(	Arrays.copyOf(m5, 99));


System.out.println("+"+   Arrays.copyOf(m5, 100));

System.out.println(Arrays.equals(member3, member4));

System.out.println(Arrays.equals(m6, m7));

System.out.println(Arrays.copyOf(m6, 99));









	
	}
}