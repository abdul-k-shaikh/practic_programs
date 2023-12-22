package com.test.array;

import java.util.Arrays;

public class SortAnArr {

	public static void main(String[] args) {
		int a[] = {1,2,4,0, 2};
		//int tem =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[j]=temp;
					a[i]=a[j];
					
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
