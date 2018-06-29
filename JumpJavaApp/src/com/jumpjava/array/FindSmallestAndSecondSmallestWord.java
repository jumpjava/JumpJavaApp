package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to find smallest and second smallest word of a given String array.
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindSmallestAndSecondSmallestWord {

	public static void main(String[] args) {

		String str = "Hello I am here to say good night, Keep learning on Jump Java";
		FindSmallestAndSecondSmallestWord.arrange(str.toUpperCase());
	}

	public static void arrange(String sentance) {

		String[] str = sentance.split(" ", sentance.length());
		TreeMap<Integer, Integer> sorted = new TreeMap<Integer, Integer>();

		for (int i = 0; i < str.length; i++) {
			sorted.put(i, str[i].length());
		}

		sortTheMapByValue(sorted, str);
	}

	public static void sortTheMapByValue(Map<Integer, Integer> sorted, String[] str) {

		Set<Entry<Integer, Integer>> set = sorted.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		List<String> sortedword = new ArrayList<String>();

		for (Map.Entry<Integer, Integer> entry : list) {
			Integer key = entry.getKey();
			sortedword.add(str[key]);
		}

		displayMapinReverse(sortedword);
	}

	public static void displayMapinReverse(List<String> sortedword) {

		Iterator<String> ltr = sortedword.iterator();

		while (ltr.hasNext()) {
			System.out.print(ltr.next() + " ");
		}

		System.out.println();
		System.out.println("Last Element - " + sortedword.get(sortedword.size() - 1));
		System.out.println("Second Last Element - " + sortedword.get(sortedword.size() - 2));

	}

}
