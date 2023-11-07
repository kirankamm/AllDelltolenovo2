package com.xworkz.abtitudeapp.abtitude.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "dlice");
		studentMap.put(2, "cob");
		studentMap.put(3, "bharlie");
		studentMap.put(4, "aavid");

		System.out.println(studentMap);

		// Size of HashMap
		int size = studentMap.size();
		System.out.println("Size of HashMap: " + size);

		// Check if a key exists
		boolean containsKey = studentMap.containsKey(2);
		System.out.println("Contains key 2? " + containsKey);

		// Check if a value exists
		boolean containsValue = studentMap.containsValue("Eve");
		System.out.println("Contains value 'Eve'? " + containsValue);

		// Get value by key
		String value = studentMap.get(3);
		System.out.println("Value for key 3: " + value);
	}

}
