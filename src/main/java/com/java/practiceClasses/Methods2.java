package com.java.practiceClasses;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Methods2 {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 2, 5, 2, 7, 4, 8, 1, 65, 2, 0, -1, -45 };
		String[] string1 = { "naveen", "rahul", "mohit", "rohit", "kamal" };
		String string2 = "manmohan";
		int int1 = 123124;

		// biggest number in an array
		System.out.println(Arrays.stream(array1).max().getAsInt());

		// Smallest number in an array
		System.out.println(Arrays.stream(array1).min().getAsInt());

		// to sort array,
		Arrays.sort(array1);

		// to sort string
		char[] charArray = string2.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);

		// reverse String
		System.out.println(new StringBuilder(string2).reverse().toString());

		// reverse array
		int stringL = string1.length - 1;
		String[] reverse = new String[stringL + 1];
		for (String aa : string1) {
			reverse[stringL--] = aa;
		}
		for (String bb : reverse) {
			System.out.print(bb + " ");
		}

		// palidrome check
		String reversed = new StringBuilder(string2).reverse().toString();
		if (string2.equals(reversed)) {
			System.out.println("palidrome");
		} else {
			System.out.println("not a palidrome");
		}

		// sum of array numbers
		int sum = 0;
		for (int num : array1) {
			sum = num + sum; // sum += num;
		}
		System.out.println(sum);

		// count odd even numbers in a array
		int oddNumber = 0;
		int evenNumber = 0;
		for (int bb : array1) {
			if (bb % 2 == 0) {
				evenNumber++;
			} else {
				oddNumber++;
			}
		}
		System.out.println("odd numbers - " + oddNumber);
		System.out.println(("even nyumbers - ") + evenNumber);

		// search for numbers/String in array (linear search)
		int index = -1;
		int numberToBeSearched = 443;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == numberToBeSearched) {
				index = i;
				System.out.println("number found at " + index + " index");
			}
		}
		if (index == -1) {
			System.out.println("number not found");
		}

		// to remove special characters from string
		string2 = string2.replaceAll("\\W", "");

		// for finding duplicate element in an array  // not working properly rn 
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j])
					System.out.println(array1[j]);
			}
		}
		
		// for removing duplicate element from an array
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		System.out.print(set);
		
		// to print date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		

	}

}
