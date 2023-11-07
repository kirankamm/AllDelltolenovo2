package com.xworkz.abtitudeapp.abtitude.array;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[] = { 2, 4, 5, 7,11 };

		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {

				System.out.println("even >>  " + b[i]);

				sumEven = sumEven + b[i];
				countEven++;
			} else {
				System.out.println("odd >>  " + b[i]);

				sumOdd = sumOdd + b[i];
				countOdd++;
			}

		}
		System.out.println("countEven > " + countEven);

		System.out.println("countEven > " + countOdd);

		System.out.println(sumEven);

		System.out.println(sumOdd);

	}
}