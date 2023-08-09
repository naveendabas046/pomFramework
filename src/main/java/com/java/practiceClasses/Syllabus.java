package com.java.practiceClasses;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class Syllabus { // creation of class
	boolean booleanVariable = true; // 1 bit
	char charVariable = 'g'; // 2 byte
	byte byteVariable = 45; // 1 byte
	short shortVariable = 452; // 2 byte
	int instanceVariable = 5 * 8; // 4 byte storing a value in a primitive variable, instance variable
	long longVariable = 56345435L; // 8 byte
	float floatVariable = 43435.5343f; // 4 byte
	double doubleVariable = 345.334d; // 8 byte
	static int staticVariable = 40; // primitive variable, static variable

	String stringObj = "naveen"; // String is class, stringObj is reference variable & naveen is value stored
	String stingObj2 = new String("naveen"); // value is stored in heap memory
	String[] stringObj3 = { "naveen", "rahul" }; // stringObj3 is an array of strings
	String[] stringObj31 =  new String []{"naveen", "rahul", "mohit"};
	String[] stringObj4 = new String[3];
	{
		stringObj4[0] = "10";
		stringObj4[2] = "11";
	}

	int[][] twoD_array1 = { { 2, 4, 5 }, { 3, 5, 3 } }; // 2 dimensional array
	int[][] twoD_array = new int[5][4];
	{
		twoD_array[0][0] = 534;
		twoD_array[0][1] = 23443;
	}
	int[][][][] multiD_array = new int[7][7][7][7];
	{
		multiD_array[0][0][0][0] = 4;
		multiD_array[0][0][0][1] = 87;
	}

	ArrayList arrayList = new ArrayList(); // arrayList is a class, arrayList is an instance of class
	{
		arrayList.add("naveen");
		arrayList.add(10);
	}
	ArrayList<String> arrayList_generic = new ArrayList(); // generic ArrayList
	{
		arrayList_generic.add("naveen");
	}
	LinkedList linkedList = new LinkedList();
	{
		linkedList.add("a");
		linkedList.add(10);
	}
	Vector vectorObj = new Vector();
	{
		vectorObj.add("naveen");
		vectorObj.add(102);
	}
	Stack stackObj = new Stack();
	{
		stackObj.add("naveen");
		stackObj.add(43534);
	}
	Queue linkedList_queue = new LinkedList(); // we can not create object on Queue because it is an interface
	Queue priority_queue = new PriorityQueue();
	Queue PriorityBlocking_queue = new PriorityBlockingQueue();
	{
		linkedList_queue.add("naveen");
		priority_queue.add(45);
		PriorityBlocking_queue.add(4356);
	}

	HashMap<Integer, String> hashMap = new HashMap<>();
	LinkedHashMap<Integer, String> linked_hashMap = new LinkedHashMap<>();
	TreeMap<Integer, String> treemap = new TreeMap<>();
	{

	}

	HashSet<String> h=new HashSet<>();
	LinkedHashSet<String> hh=new LinkedHashSet<>();
	TreeSet<String> t= new TreeSet<>();
	{

	}

	Enumeration e= vectorObj.elements();
	public Iterator itr=linkedList.iterator();
	ListIterator ltr=linkedList.listIterator();
	{

	}

	Integer intexmp = new Integer(10);
	Integer intexmp2 = 10; // same, can be used after java 5, it is doing autoboxing/unboxing
							// automatically.

	static { // static block
		System.out.println("static block");
	}

	{ // instance block
		System.out.println("instance block");
	}

	Syllabus() { // constructor
		System.out.println("line printed from user defined default constructor");
	}

	Syllabus(int a) { // user defined single argument constructor
		System.out.println("line printed from user defined 1 argument constructor");
	}

	int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	void sampleMethod1() {
		int localVariable = 5; // local variable, instance area
		System.out.println(" sampleMethod1 result is " + localVariable);
	}

	static void staticMethod() {
		int staticMethodVariable = 55; // static area, a is local variable
		System.out.println("static void is  " + staticMethodVariable);
	}

	public static void main(String[] args) {
		int MainMethodlocalVariable = 56; // localVariable is local variable inside main method
		Syllabus obj = new Syllabus(); // creation of object, reference variable s is storing address of an object
		System.out.println(obj.twoD_array);

	}
}
