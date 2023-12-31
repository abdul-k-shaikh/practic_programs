package com.test.pattern;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.println("pattern");
		int n=8;
		for(int i=1;i<8;i++) {
			for(int j=i;j<=n; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
