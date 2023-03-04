package com.test.pattern;

public class Pattert1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j%2==1)
				System.out.print(j+" ");
				else
					System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
