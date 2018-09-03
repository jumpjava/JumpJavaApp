/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 12. How do you find first repeated and non-repeated character in the given string in java?
 * */
package com.jumpjava.String;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingAndRepeatingCharacterFromString {
	public static void main(String[] args) {

		String str = "jumpjava";
		FindFirstNonRepeatingAndRepeatingCharacterFromString.getFirstNonRepeatingCharacterFromString(str);

	}

	public static void getFirstNonRepeatingCharacterFromString(String str) {

		char[] inputString = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < inputString.length; i++) {

			if (charMap.containsKey(inputString[i])) {
				charMap.put(inputString[i], charMap.get(inputString[i]) + 1);

			} else {
				charMap.put(inputString[i], 1);

			}
		}

		for (char ch : inputString) {
			if (charMap.get(ch) == 1) {
				System.out.println("First non repeated characted in String ->\"" + str + "\" is:" + ch);
				break;
			}
		}

		for (char ch : inputString) {
			if (charMap.get(ch) == 2) {
				System.out.println("First  repeated characted in String ->\"" + str + "\" is:" + ch);
				break;
			}
		}

	}

}
