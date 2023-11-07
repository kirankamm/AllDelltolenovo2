package com.xworkz.abtitudeapp.abtitude.etc;

public class StrWtSpcRmv {
	public static void main(String[] args) {

		String str = "kiran djd dkdk";
		String str1 = str.replaceAll("\\s", "");

		System.out.println(str.length());

		System.out.println(str1);
	}
}


