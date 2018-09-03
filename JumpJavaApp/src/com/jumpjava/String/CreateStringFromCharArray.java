/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 9.Write a Java program to create a new String object with the contents of a character array. 
 * */
package com.jumpjava.String;

public class CreateStringFromCharArray {

	public static void main(String[] args) {
		String str = "HelloJumpJava".toUpperCase();
		char[] charArray = str.toCharArray();
		CreateStringFromCharArray.getStringFromCharArray(charArray);

	}

	public static void getStringFromCharArray(char[] charArray) {
		char[] ch = charArray;
		String strOutput = "";

		for (int i = 0; i < ch.length; i++) {

			strOutput = strOutput + ch[i];
		}

		System.out.println(strOutput);

	}
}
