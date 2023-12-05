package com.test.array;

import java.util.Arrays;

public class RemoveDeplicatesMain {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4,2,1,1,};
		RemoveDeplicatesMain rd = new RemoveDeplicatesMain();
		int[] removeDuplicatesAndReturnUniqueArray = rd.removeDuplicatesAndReturnUniqueArray(arr);
		System.out.println(Arrays.toString(removeDuplicatesAndReturnUniqueArray));

	}

	private int[] removeDuplicatesAndReturnUniqueArray(int[] arr) {
		int uniqueArray[] = new int[arr.length-1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueArray[index++] = arr[i];
			}
		}
		return Arrays.copyOf(uniqueArray, index);
	}

}
