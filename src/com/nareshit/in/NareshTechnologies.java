package com.nareshit.in;

public class NareshTechnologies {
	public void m1() {
		System.out.println("****************");
		System.out.println("THIS IS M1() AVILLABLE IN NARESHTECHONLIGIES");
		System.out.println("****************");
	}

	public static void m2() {
		System.out.println("****************");
		System.out.println("THIS IS  static M2()  AVILLABLE IN  NARESH TECHNOLOGIES");
		System.out.println("****************");
	}

	public static void main(String[] args) {
		NareshTechnologies technologies = new NareshTechnologies();
		technologies.m1();
		m2();
	}
}
