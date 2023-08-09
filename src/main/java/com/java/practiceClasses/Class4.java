package com.java.practiceClasses;

public abstract class Class4 {   // abstract class
	static {
		System.out.println();
	}
	{
		System.out.println("intance block");
	}

	Class4() {
		System.out.println("default constructor");
	}

	void m1() {
		System.out.println("m1");
	}

	abstract void fees();  // abstract method

	public static void main(String[] args) {

	}

}

class SectionA extends Class4 {

	void fees() {
		System.out.println("section A fees 500");
	}

	public static void main(String[] args) {
		SectionA obj = new SectionA();
		Class4 obj1 = new SectionA();
		obj1.fees();

	}

}

class Encapsulation {      // encapsulation
	
	private int rollNO = 55;
	
	private int password = 24532;
	
	
	public int getRollNO() {
		return rollNO;
	}


	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}


	public int getPass() {
		return password;
	}


	public void setPass(int password) {
		this.password = password;
	}


	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getRollNO());
		System.out.println(obj.getPass());
		obj.setPass(324);
		System.out.println(obj.getPass());

	}
}
