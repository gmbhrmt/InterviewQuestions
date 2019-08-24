package com.app.java.Interview;

import java.util.Arrays;

public class Nagarro_SharedInterviewQuestion {

	// Question is write a program to replace JAva variabel to C
	// thisIsVariable should convert to this_is_variable
	private void findUpperCharAndReplaceInString() {

		String java = "thisIsVariable";
		char[] ch = java.toCharArray();

		String str = null;
		char[] newChar = new char[java.length() + (java.length() / 2)];
		int indx = 0;

		// Character.isAlphabetic(int)
		// Character.isDigit(ch)
		// Character.isLetter(ch)

		for (char c : ch) {
			// System.out.println(c+ " : "+ Character.isUpperCase(c));

			if (Character.isUpperCase(c)) {
				newChar[indx++] = '_';
				newChar[indx] = c;
			} else
				newChar[indx] = c;

			indx++;
		}
		str = String.copyValueOf(newChar);
		System.out.println(str.trim());

	}

	// Question is write a program to find String from character of string
	// aerqweNasdfAgadsgGqerAwesdfgRgRqwerO should NAGARRO
	private void findStringFromCharacterOfString() {

		String java = "aerqweNasdfAgadsgGqerAwesdfgRgRqwerO";
		char[] rtnCh = new char[java.length()];
		int indx = 0;

		for (char c : java.toCharArray()) {
			if (Character.isUpperCase(c))
				rtnCh[indx++] = c;
		}

		System.out.println(String.copyValueOf(rtnCh));

	}

	// Internet Ques : Subset Sum Problem
	// Given a set of non-negative integers, and a value sum, determine if there is
	// a subset of the given set with sum equal to given sum.
	public void subsetSum() {
		int[] intArr = { 3, 34, 4, 12, 5, 2 };
		int sumToFind = 9;
		int sum = 0;
		int temp = 0;
		int[] tempArr = new int[intArr.length];

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		temp = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] > sumToFind)
				return;
			else {
				sum += intArr[i];
				// tempArr[temp] = intArr[i];

				if (sum == sumToFind) {
					System.out.println("index started from " + temp + " till " + i);
				} else if (sum > sumToFind) {
					++temp;
					i = temp;
				}

			}
		}
		System.out.println();
	}

	// Internet Ques
	// anagram program like geeksforgeeks is anagram arora is anagram act is not
	// anagram
	// An anagram of a string is another string that contains same characters, only
	// the order of characters can be different
	public void anagramProgram() {
		String str1 = "act";
		String str2 = "tac";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (ch1.length != ch2.length) {
			System.out.println("Not anagram");
			return;
		}
		else {
			int indx = 0;
			for (char c : ch1) {
				if(Character.compare(c, ch2[indx++]) != 0) {
					System.out.println("Not anagram");
					return;
				}
			}
		}
		System.out.println("Its is anagram ");

	}
	
	//Internet Quora ques : https://www.quora.com/How-do-I-crack-Nagarro-interview
	/*
	Write a function to sort a matrix with respect to second column elements.

	input: 7 5 2 8

	2 6 5 9

	1 1 4 2

	0 3 5 9

	output: 1 1 4 2

	0 3 5 9

	7 5 2 8

	2 6 5 9
	 */
	
	public static void main(String[] args) {
		Nagarro_SharedInterviewQuestion obj = new Nagarro_SharedInterviewQuestion();
		// obj.findUpperCharAndReplaceInString();
		// obj.findStringFromCharacterOfString();
//		obj.subsetSum();
//		obj.anagramProgram();
		
		int[] ar = {2,4,5,7,2,1};
		System.out.println((ar.length/2) +1);
		
		String str = "i love program";
		boolean spaceEnc = true;
		
		for(char c : str.toCharArray()) {
			if(c == ' ')
				spaceEnc = true;
				
			else {
				if(spaceEnc) {
					System.out.print(' ');
					System.out.print(Character.toUpperCase(c));
					spaceEnc =false;
				}
				else
					System.out.print(c);
			}
			
		}
	}

}
