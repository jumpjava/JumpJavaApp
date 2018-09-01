/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 4.How to count occurrence of a given character in String.
 * */
package com.jumpjava.String;

public class FindOccuranceOfGivenCharacter {

	public static void main(String[] args) {

		String str = "HelloJumpjava".toUpperCase();
		char craracter = 'J';
		FindOccuranceOfGivenCharacter.getTheOccuranseOfGivenCharacter(str, craracter);
	}

	public static void getTheOccuranseOfGivenCharacter(String str, char craracter) {

		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == craracter) {
				count++;
			}

		}
		System.out.println("Total Count " + count+" Of Character "+craracter);
	}
}
