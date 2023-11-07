package com.xworkz.abtitudeapp.abtitude.array;

public class ProdectArray {

	public static void main(String[] args) {
		{
			int a[] = new int[400];
			int i = 0;
			int mul = 1;

			a[1] = 5;
			a[2] = 10;
			a[3] = 5;

			/* where to where count =[] */
			for (i = 1; i <= 3; i++) {
				/* formula */
				mul = a[i] * mul;
			}
			System.out.println(mul);

		}

	}

}
