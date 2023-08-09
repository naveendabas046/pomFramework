package com.java.practiceClasses;

public interface Inter1 {
	void m1();

	void m2();

	void m3();

}

interface Inter2 extends Inter1 {
	void m4();
}

abstract class Iclass implements Inter1, Inter2 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m4() {
		System.out.println("m4");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {

	}
}

class Iclass2 extends Iclass {

	@Override
	public void m2() {
		System.out.println("m2 of Iclass2");
	}

	public static void main(String[] args) {
		Inter1 obj = new Iclass2();
		obj.m2();
	}

}
