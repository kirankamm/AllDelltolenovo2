package com.xworkz.abtitudeapp.abtitude.array;

public class ArrayEvenrOddrPrimeSquar {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {

				System.out.println(" number is even number =" + " " + num[i]);
				int sum = (num[i] + 2) * (num[i] + 2);
				System.out.println("square of next even " + sum);

			} else {

				System.out.println("number is even number=" + " " + num[i]);

			}
		}
	}
}
