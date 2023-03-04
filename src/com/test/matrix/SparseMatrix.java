package com.test.matrix;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[r][c];
		int totalElement = r*c;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int ZeroCount=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(mat[i][j]==0)
					ZeroCount++;
			}
		}
		int nonZeroElement=totalElement-ZeroCount;
		if(ZeroCount>nonZeroElement)
			System.out.println("Yes");
		else
			System.out.println("NO");

	}

}
