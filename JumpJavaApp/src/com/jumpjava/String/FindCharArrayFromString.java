/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 10.Write a Java program to get the contents of a given string as a character array. 
 * */

package com.jumpjava.String;

public class FindCharArrayFromString {

	public static void main(String[] args) {

		String str = "HelloJumpJava".toUpperCase();
		FindCharArrayFromString.getCharArrayFromString(str);
	}

	public static void getCharArrayFromString(String str) {

		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + "\n");
		}
	}
}
