package com.test.matrix;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat[][]= new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(i==j) {
				 sum1+=mat[i][j];
				}
				if(i+j==r-1) {
					sum2+=mat[i][j];
				}
				//System.out.println();
			}
			//System.out.println(mat[i][j]+mat[i][j]);
			
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
