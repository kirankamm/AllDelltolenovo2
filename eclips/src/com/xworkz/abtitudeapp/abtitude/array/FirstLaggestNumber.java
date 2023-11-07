package com.xworkz.abtitudeapp.abtitude.array;

public class FirstLaggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 3, 100, 5, 6, 7, 8, 99, 1000 };
		int temp;

		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// System.out.println("jjjj" + j);
				if (a[i] < a[j]) {
					// System.out.println("less=" + a[i]);
					// System.out.println("grether=" + a[j]);

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

					// System.out.println(a[j]);
					// System.out.println("cut");
				}
				// System.out.println("inner");

			}
			// System.out.println("comlite 1 loop" + a[i]);
			// System.out.println("comlite 1 loop");

		}

		if (a.length >= 1) {
			System.out.println("First largest number is: " + a[0]);
		} else {
			System.out.println("Array is empty.");
		}
	}
}
