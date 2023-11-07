package com.xworkz.abtitudeapp.abtitude.array;

public class EvenAndOddHowMuch {

	public static void main(String args[]) {

		int evenCount = 0, oddCount = 0;

		// or
		// int evenCount=0;
		// int oddCount=0;

		for (int i = 0; i < 100; i++) {

			if (i % 3 == 0) {

				evenCount++; // or evenCount +=0;
			} else {
				oddCount++;
			}

		}

		System.out.println("even count:" + evenCount);
		System.out.println("Odd Count:" + oddCount);
	}
}
