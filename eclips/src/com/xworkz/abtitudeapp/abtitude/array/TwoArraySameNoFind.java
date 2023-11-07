package com.xworkz.abtitudeapp.abtitude.array;

public class TwoArraySameNoFind {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 7, 8, 9, 5 };

		for (int i = 0; i < array1.length; i++) // length= 0 to 4 read and charAt 1 to 5 to read//

		{
			for (int j = 0; j < array2.length; j++)

			{
				if (array1[i] == array2[j])

				{
					System.out.println("reapitating numebers is " + array1[i]);
				}
			}
		}

	}
}
