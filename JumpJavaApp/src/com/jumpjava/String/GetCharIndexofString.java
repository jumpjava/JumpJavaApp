/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 2.Write a Java program to get the character at the given index within the String.
 * */
package com.jumpjava.String;

public class GetCharIndexofString {

	public static void main(String[] args) {

		String str = "HelloJumpjava".toUpperCase();
		int index = 5;

		GetCharIndexofString.getIndexOfGivenString(str, index);
	}

	public static void getIndexOfGivenString(String str, int index) {

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (i == index) {
				System.out.println("Character :" + charArray[i] + " at Index :" + i);
			}

		}

	}

}
