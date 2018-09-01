/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 5.Write a java program to count the total number of occurrences of a given character in a string without using any loop?
 * */

package com.jumpjava.String;

public class FindOccuranceOfGivenCharacterWithoutAnyLoop {

	public static void main(String[] args) {

		String str = "HelloJumpjava".toUpperCase();
		char craracter = 'J';

		FindOccuranceOfGivenCharacterWithoutAnyLoop.getTheOccuranseOfGivenCharacter(str, craracter);
	}

	public static void getTheOccuranseOfGivenCharacter(String str, char craracter) {

		String ch = craracter + "";

		int count = str.length() - str.replace(ch, "").length();

		System.out.println("Number of occurances of " + ch + " in " + str + " = " + count);
	}
}
