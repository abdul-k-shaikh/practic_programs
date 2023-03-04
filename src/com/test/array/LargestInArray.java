package com.test.array;

import java.util.Scanner;

public class LargestInArray {
	private static int Largest(int[] ar) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++)
			if(ar[i]>max) {
				max=ar[i];
			}
		
		return max;
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elemen size");
		int size=sc.nextInt();
		int a[] = new int[size];
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		return a;
		
	}
	public static void print(int input[]) {
		int size = input.length;
		for(int i=0; i<size; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int ar[]=takeInput();
		print(ar);
		int maxVal = Largest(ar);
		System.out.println(maxVal);

	}
	

}
