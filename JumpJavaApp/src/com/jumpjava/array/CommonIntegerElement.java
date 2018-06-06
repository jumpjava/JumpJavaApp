package com.jumpjava.array;

public class CommonIntegerElement {

	public static void main(String[] args) {

		int[] _firstArray = { 1, 4, 6, 90, 34, 76, 89 };
		int[] _secondArray = { 34, 76, 89, 1, 4, 6, 90 };

		int[] finalArray = CommonIntegerElement.toFindCommonElement(_firstArray, _secondArray);

		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i]+" ");
		}
	}

	public static int[] toFindCommonElement(int[] firstArray, int[] secondArray) {

		int[] _firstArray = firstArray;
		int[] _secondArray = secondArray;
		int tmpArraylength = (_firstArray.length > _secondArray.length) ? _firstArray.length : _secondArray.length;

		int[] tmpArray = new int[tmpArraylength];
		int length = 0;

		for (int i = 0; i < _firstArray.length; i++) {

			for (int j = 0; j < _secondArray.length; j++) {

				if (_firstArray[i] == _secondArray[j]) {

					length++;

					tmpArray[i] = _secondArray[j];
				}
			}
		}

		int[] finalArray = new int[length];

		for (int i = 0; i < tmpArray.length; i++) {

			if (tmpArray[i] != 0) {

				finalArray[i] = tmpArray[i];
			}

		}
		return finalArray;

	}
}
