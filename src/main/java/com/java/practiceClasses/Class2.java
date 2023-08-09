package com.java.practiceClasses;

public class Class2 extends Class1 {
	static {
		System.out.println("class2 static block");
	}
	{
		System.out.println("class2 instance block");
	}

	@Override
	void m1() {
		System.out.println("class2 m1 method");
	}

	void m4() {
		System.out.println("class2 m4 method");
	}

	public static void main(String[] args) {
		System.out.println("class2 main method starting point");
		Class2 class2_obj = new Class2();
		class2_obj.m1();
		System.out.println();
		Class0 class2_obj2 = new Class2();
		((Class1)class2_obj2).m3();
	}

}

