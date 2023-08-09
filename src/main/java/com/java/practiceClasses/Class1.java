package com.java.practiceClasses;

public class Class1 extends Class0 {
	String class1String = "class1 string";
	static String class1_staticString = "class1 static String";

	static {
		System.out.println("Class1 static block");
	}

	{
		System.out.println("class1 instance block");
	}

	Class1() {
		System.out.println("Class1 default constructor");
	}

	Class1(int a) {
		System.out.println("Class1 user defined constructor");
	}

	@Override
	void m1() {
		System.out.println("class1 m1 method");
	}

	void m3() {
		System.out.println(class0variable);
		System.out.println("class1 m3 method");
		super.m1();
		m1();
	}

	public static void main(String[] args) {
		Class0 class1_obj1 = new Class1();
		System.out.println("value of variable from Class0 is " + Class0.class0_staticString);
		class1_obj1.m2();
	}
}
