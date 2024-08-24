package com.test.aug24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Deloitte question https://youtu.be/IYYcBMvLIuQ?si=q2MzWJagNadRdhLs
 */
public class UniquePair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int arr[] = new int[M];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		System.out.println("starts");
		System.out.println(unqPair(arr, M, num));
	}

	private static int unqPair(int[] arr, int m, int num) {  
		int total = 0;
		Arrays.sort(arr);
		Set<String> hs = new HashSet<>();
		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < m; j++) {
				if (arr[i] + arr[j] == num)
					hs.add(arr[i] + " " + arr[j]);
			}

		}
		total = hs.size();
		return total;
	}

}
