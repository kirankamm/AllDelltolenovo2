package com.xworkz.abtitudeapp.abtitude.collections;

import java.util.ArrayList;

import javax.rmi.CORBA.Stub;

public class ConsrVarblMtdUsed {

	private String name;
	private int age;

	public ConsrVarblMtdUsed(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ArrayList<ConsrVarblMtdUsed> Student = new ArrayList<>();

		ConsrVarblMtdUsed List1 = new ConsrVarblMtdUsed("kiran", 26);

		Student.add(List1);

		for (ConsrVarblMtdUsed consrVarblMtdUsed : Student) {
			consrVarblMtdUsed.display();

		}
	}
}
