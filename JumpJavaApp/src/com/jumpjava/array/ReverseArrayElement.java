package com.jumpjava.array;

import java.util.Arrays;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to reverse an array of integer values.
 * */

public class ReverseArrayElement {

	public static void main(String[] args) {

		int array[] = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		int[] reverse=ReverseArrayElement.toReverseArray(array);
		
		System.out.println(Arrays.toString(reverse));
	}

	public static int[] toReverseArray(int[] array) {
		int[] reverse = new int[array.length];

		for (int i = array.length - 1; i >= 0; i--) {
			reverse[i] = array[i];
		}

	
		return reverse;
	}
}
