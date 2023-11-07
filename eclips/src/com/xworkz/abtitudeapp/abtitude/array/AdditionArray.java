package com.xworkz.abtitudeapp.abtitude.array;

public class AdditionArray {

	public static void main(String[] args) {

		int a[] = new int[100];
		// int i = 0;
		int add = 0;

		// 1,2,3 started
		a[1] = 4;
		a[2] = 3;
		a[3] = 2;

		for (int i = 1; i <= 3; i++) /* where to where count =[] i count step by step 4 ,8 ,7 ,9= */

		{
			//System.out.println(i);

			add = add + a[i];
			
			System.out.println(add);

			/* formula */
		}

		System.out.println(add);

	}

}
