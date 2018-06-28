package com.jumpjava.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a program to find out the duplicate characters in a string Array,and find the number of repetition.
 * */

public class FindDuplicateCharValues {

	public static void main(String[] args) {

		String arr[] = { "Hello", "welcome", "to", "jump", "java", "!", "jump", "java", "is", "the", "best" };
		Map<Character, Integer> _duplicateString = FindDuplicateCharValues.getDuplicateIntValues(arr);
		FindDuplicateCharValues.displayDuplicate(_duplicateString);

	}

	public static Map<Character, Integer> getDuplicateIntValues(String[] arr) {

		Map<Character, Integer> duplicateString = new HashMap<Character, Integer>();

		String inputString = null;

		for (String string : arr) {

			inputString = inputString + string;

		}

		char[] charOfStringArray = inputString.toCharArray();

		for (char _char : charOfStringArray) {

			if (duplicateString.containsKey(_char)) {
				duplicateString.put(_char, duplicateString.get(_char) + 1);
			} else {
				duplicateString.put(_char, 1);
			}
		}

		return duplicateString;

	}

	public static void displayDuplicate(Map<Character, Integer> duplicateString) {

		Set<Character> keys = duplicateString.keySet();

		for (Character key : keys) {

			if (duplicateString.get(key) > 1) {
				System.out.println(key + "--->" + duplicateString.get(key));
			}

		}
	}

}
