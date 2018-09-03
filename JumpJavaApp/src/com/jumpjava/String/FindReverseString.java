/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 15.Write a java program to reverse a string?
 * */

package com.jumpjava.String;

public class FindReverseString {

	public static void main(String[] args) {

		String str = "jumpjava";
		FindReverseString.getReverseString(str.toUpperCase());

	}

	public static void getReverseString(String str) {

		String inputString = str;
		String outputString = "".toUpperCase();

		for (int i = 0; i < inputString.length(); i++) {

			outputString = outputString + inputString.charAt(inputString.length() - 1 - i);
		}

		System.out.println("Before reverse string is - " + inputString);
		System.out.println("After reverse string is - " + outputString);

	}
}
