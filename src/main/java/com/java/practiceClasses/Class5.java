package com.java.practiceClasses;

import java.util.Arrays;

public class Class5 {

	void m1() throws Exception {
		int x = 10 / 0;
	}

	public static void main(String[] args) {
		try {
			System.out.println(5 / 5);
			System.out.println(5 / 10);
			System.out.println(5 / 0);
			System.out.println(5 / 10);
		} catch (Exception e) {
			System.out.println("exception name - " + e);
		} finally {
			System.out.println("finally block");
		}
		try {
			throw new Exception("self made error");
		} catch (Exception e) {
			System.out.println(" self made throw keyword exception" + e);
		} finally {
			System.out.println("finally 2");
		}
		System.out.println("rest of the code");

		Class5 obj = new Class5();
		try {
			obj.m1();
		} catch (Exception e) {
			System.out.println("exception name -" + e);
		}

	}
}

class Class6 {

	@Override
	public String toString() { // overriding toString to give custom output
		return "custom to string";
	}

	public static void main(String[] args) {
		
		int intPrimitive = 432;	
		String simpleString = "naveen dabas";	
		String stringContainingInt = "10";
		int [] array1 = {2,1,3,4,2,5,6,7,1,8,0};
		
		Integer intObject = intPrimitive; // autoboxing (primitive to object)
		
		String StringObject1 = String.valueOf(intPrimitive); // (primitive to String) valueOf
		
		int primitive1 = intObject; // auto - unboxing (object to primitive)
		
		int primitive2 = intObject.intValue(); // (object to primitive)   __Value
		
		int primitive3 = Integer.parseInt(stringContainingInt); // (string to primitive)  parse___ 
		
		System.out.println(intObject.toString()); // toString
		
		Arrays.sort(array1);  // to sort array (int, String)
	}
}
