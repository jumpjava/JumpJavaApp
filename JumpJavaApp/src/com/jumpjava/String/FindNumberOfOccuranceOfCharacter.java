/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 6. Write a java program to count the number of occurrences of each character in a string?
 * */

package com.jumpjava.String;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfOccuranceOfCharacter {

	public static void main(String[] args) {

		String str = "HelloJumpJava";
		FindNumberOfOccuranceOfCharacter.getNumberOfOccuranceCharacter(str.toUpperCase());

	}

	public static void getNumberOfOccuranceCharacter(String str) {
		char[] ch = str.toCharArray();

		Map<Character, Integer> characterMap = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (characterMap.containsKey(ch[i])) {
				characterMap.put(ch[i], characterMap.get(ch[i]) + 1);
			} else {
				characterMap.put(ch[i], 1);
			}

		}

		System.out.println(characterMap);

	}
}
