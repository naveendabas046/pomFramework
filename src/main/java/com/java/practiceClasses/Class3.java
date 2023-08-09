package com.java.practiceClasses;

public class Class3 {
	Class3() {
		System.out.println("class3 default constructor");
	}

	Class3(int a) { // constructor overloading
		System.out.println("class3 default constructor 1 argument");
	}

	Class3 m1() {
		System.out.println(" parent m1 0 argument");
		return new Class3();
	}

	void m1(int a) { // method overloading
		System.out.println("m1 1 argument");
		System.out.println(5 + 5 + "naveen"); // operator overloading
		System.out.println("naveen" + 5 + 5);
		System.out.println(5 + 5);
	}

	void m2() {
		System.out.println("parent hi");
	}

	void m3() {
		System.out.println("m3");
	}

	final void m4() {
		System.out.println("m4");
	}

	public static void main(String[] args) {
		Class3 obj = new Class3();
		Class3 obj1 = new Class3(5);
		obj1.m1(5);
	}
}

class Class3_1 extends Class3 {

//	int m3() { // return type must be same at primitive level
//		System.out.println("m3");
//		return 10;
//	}

	Class3_1 m1() { // return type can be more specific version of parent class return type, this is
					// called co variant return type
		System.out.println("child m1 0 argument");
		return new Class3_1();
	}

	void m2() {
		System.out.println("child hi");
	}

//	void m4() { // final over riding is not possible
//		System.out.println();
//	}

	public static void main(String[] args) {
		Class3_1 obj = new Class3_1();
		obj.m1();
	}
}