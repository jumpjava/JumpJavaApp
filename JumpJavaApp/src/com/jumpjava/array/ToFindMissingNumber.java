package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to find a missing number in an Integer array.
 * */

public class ToFindMissingNumber {

	public static void main(String[] args) {

		int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };// 67,11
		int actualSum = ToFindMissingNumber.getInputSequenceSum(sequence);
		int expectedSum = ToFindMissingNumber.getActualSequenceSum(12);
		ToFindMissingNumber.getMissingNumber(expectedSum, actualSum);

	}

	public static int getInputSequenceSum(int[] sequence) {

		int actualSum = 0;
		int[] inputsequence = sequence;

		for (int i = 0; i < inputsequence.length; i++) {
			actualSum = actualSum + inputsequence[i];
		}

		System.out.println("Actual Sum  - " + actualSum);
		return actualSum;

	}

	public static int getActualSequenceSum(int length) {

		length = 12;
		int expectedSum = 0;

		expectedSum = length * (length + 1) / 2;
		System.out.println("Expected Sum - " + expectedSum);
		return expectedSum;

	}

	public static void getMissingNumber(int expectedSum, int actualSum) {

		int missingNumber = 0;

		missingNumber = expectedSum - actualSum;
		System.out.println("Missing Number - " + missingNumber);

	}
}
