package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to reverse an array of integer values.
 * */

public class ReverseArrayElement {

	public static void main(String[] args) {
		int array[] = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
		ReverseArrayElement.toReverseArray(array);
	}

	public static void toReverseArray(int[] array) {

		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
	}
}
