package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 7. Write a Java program to test the equality of two arrays.
 * */
import java.util.Arrays;

public class TestTheEqualityOfTwoArrays {

	public static void main(String[] args) {

		int firstArray[] = { 1, 2, 3, 6, 7, 5, 4 };
		int secondArray[] = { 1, 2, 7, 5, 4, 3, 6, };

		boolean checkEquality = TestTheEqualityOfTwoArrays.checkEqualityOfTwoArrays(firstArray, secondArray);

		if (checkEquality) {

			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

	public static boolean checkEqualityOfTwoArrays(int[] firstArray, int[] secondArray) {

		int[] firstInputArray = firstArray;
		int[] secondInputArray = secondArray;
		boolean isEqual = false;

		if (firstInputArray.length > 0 && secondInputArray.length > 0) {

			Arrays.sort(firstInputArray);
			Arrays.sort(secondInputArray);

			for (int i = 0; i < firstInputArray.length; i++) {

				for (int j = 0; j < secondInputArray.length; j++) {

					if (firstInputArray[i] == secondInputArray[j]) {
						isEqual = true;
					} else {
						isEqual = false;
					}
				}
			}

		}
		return isEqual;

	}

}
