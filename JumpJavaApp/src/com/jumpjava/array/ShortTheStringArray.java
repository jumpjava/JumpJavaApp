package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 9. Write a Java program to sort the string array.
 * */

public class ShortTheStringArray {

	public static void main(String[] args) {

		String[] mySampleStringArray = { "Z", "D", "A", "M", "B", "L", "C", "X" };

		String[] shortedArray = ShortTheStringArray.getShortNumericArray(mySampleStringArray);
		ShortTheStringArray.displayShortedStringArray(shortedArray);

	}

	public static String[] getShortNumericArray(String[] inputArray) {

		String[] str = inputArray;

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i].compareTo(str[j]) > 0) {
					String tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}

		return str;

	}

	public static String[] displayShortedStringArray(String[] inputArray) {

		String[] str = inputArray;

		for (int i = 0; i < str.length; i++) {

			System.out.print(str[i]+" ");
		}
		return str;

	}

}
