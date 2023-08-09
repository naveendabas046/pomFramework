package com.java.practiceClasses;

public class Class0 {
	public int class0variable = 5675;
	String class0string = "class0 string";
	static String class0_staticString = "class0 static string";

	static {
		System.out.println("class0 static block");
	}

	{
		System.out.println("class0 instance block");
	}

	Class0() {
		System.out.println("class0 default constructor");
	}

	Class0(int a) {
		System.out.println("class0 user defind 1 argument constructor");
	}

	Class0(float a){
		System.out.println("class0 user defined (float type) consturcctor");
	}

	void m1() {
		System.out.println("class0 m1 method");
	}

	int m2() {
		System.out.println("class0 m2 method");
		return 10;
	}

	public static void main(String[] args) {
	int mainMethodvariable = 45;
		System.out.println("class 0 main program line");
		Class0 class0_obj0 = new Class0();
		Class0 class0_obj1 = new Class0(1);
		class0_obj0.m2();
		System.out.println(class0_obj0.m2());                                     // for printing return value
	}
}
