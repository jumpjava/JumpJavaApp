package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a java program to reverse an array without using an additional array?

 * */

import java.util.Arrays;

public class ReverseArrayWitoutSecondArray {

	public static void main(String[] args) {
		int array[] = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
		int[] reverse = ReverseArrayWitoutSecondArray.toReverseArray(array);
		System.out.println(Arrays.toString(reverse));

	}

	public static int[] toReverseArray(int[] array) {

		int middle = array.length / 2;
		int i = 0;
		int j = array.length - 1;
		int temp = 0;

		for (; i < middle; i++, j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;

		}

		return array;
	}

}
