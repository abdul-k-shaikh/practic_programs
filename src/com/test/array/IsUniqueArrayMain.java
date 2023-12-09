package com.test.array;

public class IsUniqueArrayMain {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		IsUniqueArrayMain ob = new IsUniqueArrayMain();
		boolean res = ob.isUnique(arr);
		System.out.println("isUnique result :"+ res);	
	}

	private boolean isUnique(int[] arr) {
		boolean res=true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					 res=false;
				}
				else {
					res=true;
				}
			}
		}
		return res;
	}

}
