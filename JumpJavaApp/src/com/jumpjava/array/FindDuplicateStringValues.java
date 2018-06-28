package com.jumpjava.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to find the duplicate values of an array of string values.

 * */

public class FindDuplicateStringValues {

	public static void main(String[] args) {
		
		String arr[] = { "Hello", "welcome", "to", "jump", "java", "!", "jump", "java", "is", "the", "best" };

		Map<String, Integer> _duplicateString = FindDuplicateStringValues.getDuplicateIntValues(arr);
		FindDuplicateStringValues.displayDuplicate(_duplicateString);

	}

	public static Map<String, Integer> getDuplicateIntValues(String[] arr) {

		Map<String, Integer> duplicateString = new HashMap<String, Integer>();

		for (String string : arr) {

			if (duplicateString.containsKey(string)) {
				duplicateString.put(string, duplicateString.get(string) + 1);
			} else {
				duplicateString.put(string, 1);
			}
		}

		return duplicateString;

	}

	public static void displayDuplicate(Map<String, Integer> duplicateString) {

		Set<String> keys = duplicateString.keySet();

		for (String key : keys) {

			if (duplicateString.get(key) > 1) {
				System.out.println(key + "--->" + duplicateString.get(key));
			}

		}
	}

}
