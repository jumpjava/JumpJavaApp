package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to remove a specific element from an array. 
 * */

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {
		int array[] = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
		int elementToRemove = 55;
		RemoveSpecificElementFromArray.toRemoveSpecificElemetFromArray(array, elementToRemove);

	}

	public static void toRemoveSpecificElemetFromArray(int[] array, int elementToRemove) {

		int[] inputArray = array;
		int toRemove = elementToRemove;

		System.out.println("Before Removing the element " + elementToRemove);

		for (int i = 0; i < inputArray.length; i++) {

			System.out.print(inputArray[i]+" ");
		}

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] == toRemove) {
				
				inputArray[i] = inputArray[i + 1];
				inputArray[i+1] = 0;
				
			}
		}
		System.out.println();
		System.out.println("After Removing the element " + elementToRemove);

		for (int i = 0; i < inputArray.length; i++) {

			System.out.print(inputArray[i]+" ");
		}

	}
}
