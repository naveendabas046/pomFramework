package com.java.practiceClasses;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Methods {
	Scanner sc = new Scanner(System.in);
	int inputValueint;
	String inputValueString;

	public void decreasingStarPrint() {
		System.out.println("enter value for decreasing star -");
		inputValueint = sc.nextInt();
		for (int i = 0; i <= inputValueint; i++) {
			for (int j = i; j < inputValueint; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		lastMethod();
	}

	public void duplicateWord() {
		String expression = "Hi, I am Hritik and I am a programmer";
		String[] words = expression.split("\\W");
		Set<String> set = new HashSet<>();
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = 1; j < words.length; j++) {
				if (words[i].equals(words[j]) && i != j) {
					set.add(words[i]);
				}
			}
		}
		System.out.println(set);
	}

	public void evenNumber() {
		System.out.println("enter value for even number -");
		inputValueint = sc.nextInt();
		for (int i = 1; i <= inputValueint; i++) {
			while (i % 2 == 0) {
				System.out.print(i + " ");
				i++;
			}
		}
		System.out.println();
		lastMethod();
	}

	public void factorial() {
		int i;
		int fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public void fibonacci() {
		int n1 = 0, n2 = 1, n3, i;
		System.out.println("enter the fibonacci number");
		inputValueint = sc.nextInt();
		System.out.print(n1 + " " + n2);// printing 0 and 1
		for (i = 2; i < inputValueint; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
		lastMethod();
	}

	public void increasingStarPrint() {
		System.out.println("enter value for increasing star -");
		inputValueint = sc.nextInt();
		for (int i = 0; i < inputValueint; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		lastMethod();
	}

	public void twoD() {
		System.out.println("enter numbers of rows required ");
		int row = sc.nextInt();
		System.out.println("enter numbers of columns required ");
		int column = sc.nextInt();
		int[][] twoD = new int[row][column];

		int value = 1;
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[1].length; j++) { // for storing data inside 2D array
				twoD[i][j] = value;
				value++;
			}
		}
		System.out.println("2D array is - ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
		lastMethod();
	}

	public void palindromeCheck() {
		System.out.println("enter number that needs to be checked for palindrome - ");
		inputValueString = sc.nextLine();
		String revered = new StringBuilder(inputValueString).reverse().toString();
		if (inputValueString.equals(revered)) {
			System.out.println(inputValueString + " is Palindrome number");
		} else {
			System.out.println(inputValueString + " is not a Palindrome number");
		}
		lastMethod();
	}

	void primeNumber() {
		System.out.println("enter the number till where prime number needs to be printied -");
		inputValueint = sc.nextInt();
		System.out.println("Prime numbers between 1 and " + inputValueint + ":");
		for (int i = 2; i <= inputValueint; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		lastMethod();
	}

	boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void reverseString() {
		System.out.println("enter the string that you want to reverse - ");
		inputValueString = sc.nextLine();
		String reversed = new StringBuilder(inputValueString).reverse().toString();
		System.out.println("reversed string is - " + "\n" + reversed);
		lastMethod();
	}

	public void showList() {
		System.out.println("star increase" + "\n" + "star decrease" + "\n" + "even number" + "\n" + "2d array" + "\n"
				+ "Palindrome" + "\n"+ "duplicate word" +"\n"+ "reverse string" + "\n" + "prime number" + "\n" + "fibonacci"
				+ "\n" +"factorial");
		lastMethod();
	}

	public void lastMethod() {
		System.out.println("type 1 if you want to try any method, type \"show list\" for seeing list of programs"
				+ " otherwise press ENTER if you want to exit");
		Scanner sc1 = new Scanner(System.in);
		String inputValueString1 = sc1.nextLine();

		while (true) {
			if (inputValueString1.equals("1")) {
				Methods.main(null);
				break;
			} else if (inputValueString1.equals("show list")) {
				showList();
				break;
			} else if (inputValueString1.equals("")) {
				System.out.println("thatnks for using this program, signing off....");
				break;
			} else {
				lastMethod();
				break;
			}
		}
		sc1.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Methods obj = new Methods();

		while (true) {
			System.out.println("enter the program name you want to execute - ");
			String programName = sc.nextLine();

			if (programName.equalsIgnoreCase("star increase")) {
				obj.increasingStarPrint();
				break;
			}

			else if (programName.equalsIgnoreCase("star decrease")) {
				obj.decreasingStarPrint();
				break;
			}

			else if (programName.equalsIgnoreCase("even number")) {
				obj.evenNumber();
				break;
			}

			else if (programName.equalsIgnoreCase("2d array")) {
				obj.twoD();
				break;
			}

			else if (programName.equalsIgnoreCase("Palindrome")) {
				obj.palindromeCheck();
				break;
			}
			
			else if (programName.equalsIgnoreCase("duplicate word")) {
				obj.duplicateWord();
				break;
			}

			else if (programName.equalsIgnoreCase("Reverse String")) {
				obj.reverseString();
				break;
			}

			else if (programName.equalsIgnoreCase("prime number")) {
				obj.primeNumber();
				break;
			}

			else if (programName.equalsIgnoreCase("fibonacci")) {
				obj.fibonacci();
				break;
			}
			
			else if (programName.equalsIgnoreCase("factorial")) {
				obj.factorial();
				break;
			}

			else {
				obj.lastMethod();
				break;
			}
		}
		sc.close();
	}
}