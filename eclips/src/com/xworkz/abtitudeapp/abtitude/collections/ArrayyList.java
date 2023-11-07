package com.xworkz.abtitudeapp.abtitude.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apples");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Strowberry");

		int si = fruits.size();
		System.out.println(si);

		boolean remove = fruits.remove("Banana");
		System.out.println(remove);

		System.out.println(fruits);

		boolean Emty = fruits.isEmpty();
		System.out.println(Emty);

		Boolean cont = fruits.contains("Orange");
		System.out.println(cont);

		Boolean cont1 = fruits.contains("Orang");
		System.out.println(cont1);

		String ge = fruits.get(2);
		System.out.println(ge);

	}

}
