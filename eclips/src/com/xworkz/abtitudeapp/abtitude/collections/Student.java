package com.xworkz.abtitudeapp.abtitude.collections;

import java.util.ArrayList;

public class Student {

	// Step 1: Define a class called "Student" with variables, methods, and a
	// constructor

	// Variables
	private String name;
	private int age;

	// Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display student information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		// Step 2: Create objects of the "Student" class
		Student student1 = new Student("Alice", 20);
		Student student2 = new Student("Bob", 22);

		// Step 3: Call methods on the objects
		System.out.println("Student 1 Information:");
		student1.displayInfo();
		System.out.println("\nStudent 2 Information:");
		student2.displayInfo();

		// Step 4: Use a collection (ArrayList) to store and display student objects
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);

		// Step 5: Iterate through the collection and display student information
		System.out.println("\nStudent List:");
		for (Student student : studentList) {
			student.displayInfo();
			System.out.println(); // Add a newline for separation
		}
	}
}
