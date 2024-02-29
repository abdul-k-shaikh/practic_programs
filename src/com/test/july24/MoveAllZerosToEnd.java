package com.test.july24;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int a[] = {1,0,4,5,0,8};
		int len = a.length;
		int count = 0;
		
		//Move non zero element to the front
		for(int i=0; i<len; i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		
		 // Fill the remaining positions with zeros
		while(count<len) {
			a[count]=0;
			count++;
		}
		
        // Print the modified array
		for(int j=0; j<len; j++) {
			System.out.println(a[j]);
		}
	}

}
