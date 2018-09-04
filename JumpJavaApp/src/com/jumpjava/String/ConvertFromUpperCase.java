/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 19.Write a Java program to convert all the characters in a string to Upper case.  
 * */
package com.jumpjava.String;

public class ConvertFromUpperCase {

	public static void main(String[] args) {

		String str = "i love jump java";
		ConvertFromUpperCase.getLowerCase(str);
	}

	public static void getLowerCase(String str) {
		String inputString=str;
		String output=inputString.toUpperCase();
		System.out.println("Input String -> "+inputString);
		System.out.println("Output String -> "+output);

	}
}
