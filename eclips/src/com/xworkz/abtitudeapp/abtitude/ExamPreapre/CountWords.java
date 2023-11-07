package com.xworkz.abtitudeapp.abtitude.ExamPreapre;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

//		System.out.println("Enter the  String");
//
//		Scanner sc = new Scanner(System.in);
//		String d = sc.nextLine(); // convert to the give by user input ex... welcome to java//

		// or
		String d = "kiran shiva kammar";

		int count = 1;

		for (int i = 1; i <= d.length() - 1; i++) {

			// System.out.println(i);

			if ((d.charAt(i) == ' ') && (d.charAt(i + 1) != ' ')) { // words after space &&kkkk after space word is
				 System.out.println(i);
				 System.out.println("d=" + d);
				count++;
				// System.out.println("count=" + count);

			}

		}
		System.out.println("Total No of words are counted" + " " + count);

	}

}

//if ( (d.charAt(i + 1) != ' ')) { // words after space && after space word is there //
//
//count++;
//}  make it oput=space not count and count the only charecter