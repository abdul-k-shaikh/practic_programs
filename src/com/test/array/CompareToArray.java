package com.test.array;

public class CompareToArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[] = {5,1,7,9};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
				  System.out.println("common elements is :"+ b[j]);
				}
			}
		}

	}

}
