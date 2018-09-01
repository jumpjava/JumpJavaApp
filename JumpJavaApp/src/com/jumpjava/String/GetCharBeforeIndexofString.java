/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 3.Write a Java program to get the character before the specified index within the String.
 * */
package com.jumpjava.String;

public class GetCharBeforeIndexofString {

	public static void main(String[] args) {
		
		String str = "HelloJumpjava".toUpperCase();
		int index = 5;

		GetCharBeforeIndexofString.getCharBeforeGivenIndexOfString(str, index);
	}
	
	public static void getCharBeforeGivenIndexOfString(String str, int index) {
		


		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (i == index-1) {
				System.out.println("Character :" + charArray[i] + " before Index :" + i);
			}

		}

	
		
	}
}
