/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 14.How to remove duplicate characters from String?
 * */
package com.jumpjava.String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String str = "JUMPJAVA";
		RemoveDuplicateCharacterFromString.toRemoveDuplicateCharacterFromString(str.toUpperCase());
	}

	public static void toRemoveDuplicateCharacterFromString(String str) {

		Set<Character> reoveduplicate = new HashSet<Character>();
		char[] charFromWord = str.toCharArray();
		String output = "";

		for (int i = 0; i < charFromWord.length; i++) {
			reoveduplicate.add(charFromWord[i]);
		}

		System.out.println(reoveduplicate);

		Iterator<Character> itr = reoveduplicate.iterator();

		while (itr.hasNext()) {
			output = output + itr.next();
		}

		System.out.println("Before removing the duplicate character from String : " + str);
		System.out.println("After removing the duplicate character from String : " + output);

	}

}
