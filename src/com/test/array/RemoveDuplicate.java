package com.test.array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,5,6};
		int count =0;
		for(int i=0; i<a.length; i++) {
			for(int j=1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("Duplicates "+a[i]);
			}
		}
		

	}

}
