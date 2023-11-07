package com.xworkz.abtitudeapp.abtitude.array;

public class ArrayOddEven {

	public static void main(String args[]) {
		/* array */
		int[] a = {  2, 4, 12, 6, 10, 8, 11 };

		System.out.println("It is Total Numbers counted : " + a.length);

		for (int i = 0; i <= a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i] + "= number is even by:" + i);
			} else {
				System.out.println(a[i] + " = this no is odd" + i);
			}

		}

	}
}
