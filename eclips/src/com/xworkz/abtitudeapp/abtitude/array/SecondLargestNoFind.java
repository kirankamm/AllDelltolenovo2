package com.xworkz.abtitudeapp.abtitude.array;

public class SecondLargestNoFind {

	public static void main(String[] args) {

		int[] a = { 10, 2, 3, 4, 5, 6, 7, 1000, 99 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp; // 2nd largest no u want comment out
					// temp = a[j];
				}
			}
		}
		// for(int i=0; i<a.length; i++)//
		{
			System.out.print("2 largeste no is:" + a[1]);

		}

	}
}
