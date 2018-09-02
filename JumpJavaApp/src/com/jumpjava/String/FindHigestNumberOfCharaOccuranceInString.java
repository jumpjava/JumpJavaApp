/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 7. How  to return highest occurred character in a String?
 * */
package com.jumpjava.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindHigestNumberOfCharaOccuranceInString {

	public static void main(String[] args) {
		
		String str = "HelloJumpJava";
		Map<Character, Integer> charOccuranceMap=FindHigestNumberOfCharaOccuranceInString.getNumberOfOccuranceCharacter(str.toUpperCase());
		FindHigestNumberOfCharaOccuranceInString.getHigestNumberOfCharaOccuranceInString(charOccuranceMap);
		
		
	}
	
	public static Map<Character, Integer> getNumberOfOccuranceCharacter(String str) {
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
		return characterMap;

	}
	
	public static void getHigestNumberOfCharaOccuranceInString(Map<Character, Integer> charOccuranceMap){
		
		Set<Entry<Character, Integer>> entrySet=charOccuranceMap.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(entrySet);
		
		/*Start: Uncomment This if you want to short the Map*/
         /*	Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>()
	        {
	            public int compare( Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
		 
		 for(Map.Entry<Character, Integer> entry:list){
			 
			 System.out.println(entry.getKey()+" ==== "+entry.getValue());
	            
	        }*/
		/*End: Uncomment This if you want to short the Map*/
		
		 int maxValueInMap=(Collections.max(charOccuranceMap.values()));  // This will return max value in the Hashmap
	        for (Entry<Character, Integer> entry : charOccuranceMap.entrySet()) {  // Itrate through hashmap
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println("Key-> "+entry.getKey()+" Value->"+maxValueInMap);     // Print the key with max value
	            }
	        }
	}
}
