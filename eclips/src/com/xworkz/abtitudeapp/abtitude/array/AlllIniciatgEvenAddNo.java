package com.xworkz.abtitudeapp.abtitude.array;

import java.util.ArrayList;
import java.util.List;

public class AlllIniciatgEvenAddNo {

	public static void main(String args[]) {
		/* array */

		int[] inputArray = { 11, 22, 33, 44, 55, 6, 7, 8, 9 };
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();

		for (int num : inputArray) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			} else {
				oddNumbers.add(num);
			}
		}

		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Odd numbers: " + oddNumbers);
	}
}
