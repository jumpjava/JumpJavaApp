/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 17.Write a Java program to convert all the characters in a string to lower case.  
 * */
package com.jumpjava.String;

public class ConvertFromLowerCase {

	public static void main(String[] args) {

		String str = "I LOVE JUMP JAVA";
		ConvertFromLowerCase.getLowerCase(str);
	}

	public static void getLowerCase(String str) {
		String inputString=str;
		String output=inputString.toLowerCase();
		System.out.println("Input String -> "+inputString);
		System.out.println("Output String -> "+output);

	}
}
