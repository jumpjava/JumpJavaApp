package com.jumpjava.array;

import java.util.Arrays;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to copy an array element from OLD array to new Array by iterating the OLD array.
 * */

public class CoppyArrayFromOLDtoNEW {

	public static void main(String[] args) {

		int array[] = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		CoppyArrayFromOLDtoNEW.toCopyArray(array);

	}

	public static void toCopyArray(int[] array) {

		int[] OLDarray = array;
		int[] newarray = new int[OLDarray.length];

		System.out.println("OLD Array->"+Arrays.toString(OLDarray));
		
		for (int i = 0; i < OLDarray.length; i++) {
			newarray[i] = OLDarray[i];

		}

		System.out.println("New Array->"+Arrays.toString(newarray));
	}

}
