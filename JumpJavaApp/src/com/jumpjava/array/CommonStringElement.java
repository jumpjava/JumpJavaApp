package com.jumpjava.array;

/*
 * Author : JumpJava.com
 * JAVA : 1.7
 * Program : Write a Java program to find the common elements between two string arrays.
 * */

public class CommonStringElement {

	public static void main(String[] args) {

		String[] firstArray = { "jump", "java", "is", "the", "best" };
		String[] secondArray = { "jump", "java", "program", "collection ", "is", "the", "best" };

		String[] finalArray = CommonStringElement.toFindCommonElement(firstArray, secondArray);
		for (int i = 0; i < finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}

	}

	public static String[] toFindCommonElement(String[] firstArray, String[] secondArray) {

		String[] _firstArray = firstArray;
		String[] _secondArray = secondArray;

		int tmpArraylength = (_firstArray.length > _secondArray.length) ? _firstArray.length : _secondArray.length;

		String[] tmpArray = new String[tmpArraylength];
		int length = 0;

		for (int i = 0; i < _firstArray.length; i++) {

			for (int j = 0; j < _secondArray.length; j++) {

				if (_firstArray[i].equalsIgnoreCase(_secondArray[j])) {
					length++;
					tmpArray[i] = _secondArray[j];
				}
			}
		}

		String[] finalArray = new String[length];

		for (int i = 0; i < tmpArray.length; i++) {

			if (tmpArray[i] != null) {
				finalArray[i] = tmpArray[i];
			}

		}
		return finalArray;

	}
}
