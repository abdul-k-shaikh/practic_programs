package com.test.array;

import java.util.Arrays;

public class SortAnArr {

	public static void main(String[] args) {
		int a[] = {3,2,1,4,0,};
		//int tem =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
//					System.out.println(temp);
				}
				
			}
			System.out.println(a[i]);
		}
//		System.out.println(a[i]);
//		System.out.println(Arrays.toString(a));
	}

}
