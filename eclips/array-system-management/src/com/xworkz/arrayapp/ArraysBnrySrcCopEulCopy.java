package com.xworkz.arrayapp;

import java.util.Arrays;

public class ArraysBnrySrcCopEulCopy {


	public static void main(String[] args) {
		
		    int[] m6= {113,144,166,177,1991,166};
		    int[] m7= {113,144,166,177,1991,166};
		    
		     char[]  member4= {45,35,88,65,99,99,77};
		    int[] m5= {99,100,101,102,107,100};
		    
		     long[] member1= {200000,30,40,40,60,70};
            long[] member2=  {30000,90,70,80,80,60};
            char[]  member3= {17,17,13,14,15,16,20};
 
  	
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
