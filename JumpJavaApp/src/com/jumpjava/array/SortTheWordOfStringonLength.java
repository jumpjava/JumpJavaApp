package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a program to sort the word of String on the basis of word length.
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortTheWordOfStringonLength {

	public static void main(String[] args) {

		String str = "Hello I am here to say good night, Keep learning on Jump Java";
		SortTheWordOfStringonLength.arrange(str.toUpperCase());
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

		ListIterator<String> ltr = sortedword.listIterator(sortedword.size());

		while (ltr.hasPrevious()) {
			System.out.print(ltr.previous() + " ");
		}

	}

}
