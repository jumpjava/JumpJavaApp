package com.jumpjava.array;

/*
 * Author : JumpJava.com
 * JAVA : 1.7
 * Program : 31.Write a Java Program to rotate the Array depends on number of rotation dynamically.
			   Ex: 
			       Array              : [1,2,3,4,5]
			       Number of rotation : 3
			       Final Output       : [4,5,1,2,3]
			       
			       Iteration :
							    Rotation-1 :[2,3,4,5,1]
								Rotation-2 :[3,4,5,1,2]
								Rotation-3 :[4,5,1,2,3]
 * */

public class ArraysLeftRotation {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int rotation = 3;
		int[] arr = ArraysLeftRotation.getArrayRotation(array, rotation);
		ArraysLeftRotation.display(arr);

	}

	public static int[] getArrayRotation(int[] inputArr, int rotation) {

		int[] arr = inputArr;

		for (int i = 0; i < rotation; i++) {

			int tmp = arr[0];
			int j = 0;

			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}

			arr[j] = tmp;
		}
		return arr;
	}

	public static void display(int[] arr) {

		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + " ");
		}

	}
}
