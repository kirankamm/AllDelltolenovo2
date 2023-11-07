package com.xworkz.abtitudeapp.abtitude.array;

public class AscendingDscenOrder {

	public static void main(String[] args) {

		int[] arrayAscending = new int[] { 9, 8, 54, 55 };
		int temp;

		for (int i = 0; i < arrayAscending.length; i++) {
			// System.out.println(i);
			for (int j = i + 1; j < arrayAscending.length; j++) {
				// System.out.println("ii"+i);
				System.out.println("rr" + j);
				if (arrayAscending[i] > arrayAscending[j]) {// if (arrayAscending[i] < arrayAscending[j]){=Dscending
					temp = arrayAscending[i];
					arrayAscending[i] = arrayAscending[j]; // This line this is arrayAscending[j]== Empty
					arrayAscending[j] = temp;

				}
			}

		}
		for (int a : arrayAscending) {
			System.out.println(a);
		}
	}
}
