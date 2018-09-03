/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 13.Write a java program to find the duplicate words and their number of occurrences in a string?
 * */

package com.jumpjava.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWordInString {

	public static void main(String[] args) {

		String str = "Hello jump Java I like Java hello";

		Map<String, Integer> getDuplicateCharacter = FindDuplicateWordInString.toFindDuplicateWord(str);

		Set<String> keyset = getDuplicateCharacter.keySet();

		Iterator<String> itr = keyset.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			Integer value = getDuplicateCharacter.get(key);

			if (value > 1) {
				System.out
						.println("Character - " + key + " Repeat - " + value + " Times" + " Of Input String - " + str);
			}

		}
	}

	public static Map<String, Integer> toFindDuplicateWord(String inputStr) {

		String str = inputStr.toUpperCase();

		String[] word = str.split(" ", str.length());

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < word.length; i++) {

			if (map.containsKey(word[i]) == true) {

				map.put(word[i], map.get(word[i]) + 1);

			} else {

				map.put(word[i], 1);
			}

		}
		return map;
	}

}
