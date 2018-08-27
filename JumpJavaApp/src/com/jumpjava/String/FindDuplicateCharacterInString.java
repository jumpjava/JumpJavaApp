/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 1.How to Print duplicate characters from String
 * */

package com.jumpjava.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {

		String str = "jumpJava";

		Map<Character, Integer> getDuplicateCharacter = FindDuplicateCharacterInString.toFindDuplicateCharacter(str);

		Set<Character> keyset = getDuplicateCharacter.keySet();

		Iterator<Character> itr = keyset.iterator();

		while (itr.hasNext()) {
			Character key = itr.next();
			Integer value = getDuplicateCharacter.get(key);
			
			if(value>1){
				System.out.println("Character - "+key+" Repeat - "+value+" Times"+" Of Input String - "+str);
			}
			
		}
	}

	public static Map<Character, Integer> toFindDuplicateCharacter(String inputStr) {
		String str = inputStr.toUpperCase();
		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i]) == true) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}

		}
		return map;
	}

}
