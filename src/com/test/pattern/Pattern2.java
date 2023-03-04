package com.test.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		int n=4;
		int p=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++,p++){
				System.out.print(p+" ");
			}
			System.out.println();
		}	
	}
}
