package com.app.java.Interview;

import java.util.Arrays;

public class Nagarro_SharedInterviewQuestion {

	//Question is write a program to replace JAva variabel to C 
	//thisIsVariable should convert to this_is_variable
	private void findUpperCharAndReplaceInString() {
		
		String java = "thisIsVariable";
		char[] ch = java.toCharArray();
		
		String str = null;
		char[] newChar = new char[java.length() + (java.length()/2)];
		int indx = 0;
		
//		Character.isAlphabetic(int)
//		Character.isDigit(ch)
//		Character.isLetter(ch)
		
		for(char c : ch) {
//			System.out.println(c+ " : "+ Character.isUpperCase(c));
			
			if(Character.isUpperCase(c)) {
				newChar[indx++] = '_';
				newChar[indx] = c;
			}
			else
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
		
		for(char c : java.toCharArray()) {
			if(Character.isUpperCase(c))
				rtnCh[indx++] = c;
		}
		
		System.out.println(String.copyValueOf(rtnCh));

	}
	
	public static void main(String[] args) {
		Nagarro_SharedInterviewQuestion obj = new Nagarro_SharedInterviewQuestion();
//		obj.findUpperCharAndReplaceInString();
		obj.findStringFromCharacterOfString();
		

	}

}
