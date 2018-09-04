/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 16.Write a java program to reverse each word of a given string?
  			   INPUT : I LOVE JUMP JAVA 
  			   OUTPUT: I EVOL PMUJ AVAJ 
 * */
package com.jumpjava.String;

public class FindReverseCharacterOfString {

	public static void main(String[] args) {

		String str = "I LOVE JUMP JAVA";
		FindReverseCharacterOfString.getReverseCharacterOfString(str);
	}

	public static void getReverseCharacterOfString(String str) {

		String inputString = str;
		String outPutString = "";

		String[] wordArray = inputString.split(" ", inputString.length());

		for (int i = 0; i < wordArray.length; i++) {

			// String word=wordArray[i];
			char[] charOfWord = wordArray[i].toCharArray();

			for (int j = charOfWord.length - 1; j >= 0; j--) {
				outPutString = outPutString + charOfWord[j];
			}
			outPutString = outPutString + " ";
		}

		System.out.println(outPutString);
	}
}
