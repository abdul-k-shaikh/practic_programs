package com.test.matrix;

import java.util.Scanner;

public class TransPoseMatrix {

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
		int tr[][]=new int [r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				tr[j][i]=mat[i][j];
				System.out.print(tr[j][i]+" ");
			}
			//System.out.println(mat[i][j]+mat[i][j]);
			System.out.println();
		}
		
		
	}

}
