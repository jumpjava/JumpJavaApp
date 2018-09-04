/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 16.Write a java program to reverse each word of a given string?
  			 INPUT : I LOVE JUMP JAVA 
  			 OUTPUT: JAVA JUMP LOVE I 
 * */
package com.jumpjava.String;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "I LOVE JUMP JAVA";
		ReverseWord.getReverseWordFromString(str);
	}

	public static void getReverseWordFromString(String str) {

		String[] inputStr = str.split(" ", str.length());
		String outputString = "".trim();
		for (int i = inputStr.length - 1; i >= 0; i--) {

			outputString = outputString + inputStr[i] + " ";
		}

		System.out.println("Before reversing the Input String -> " + str);
		System.out.println("After reversing the Input String -> " + outputString);
	}
}
