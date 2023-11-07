package com.xworkz.abtitudeapp.abtitude.ExamPreapre;

public class ExtraStringReverse {

	public static void main(String a[]) {

		// 12345=index== 01234=length=compare in both leng to charAt
		String name = "kiran";
		int leng = name.length();
		String rev = " ";

		for (int i = leng - 1; i >= 0; i--) {
			System.out.println(i);
			rev = rev + name.charAt(i);

			System.out.println(rev);
		}

		System.out.println("This is a name Reversed :==" + rev);

	}
}
