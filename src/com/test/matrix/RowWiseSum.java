package com.test.matrix;

import java.util.Scanner;
/*2 3
1 2 = 3
2 3 = 5
3 4 = 7
*/

public class RowWiseSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat[][]= new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<r; i++) {
			 sum=0;
			for(int j=0; j<c; j++) {
				//System.out.println(mat[i][j]+mat[i][j]); 
				//System.out.println(sum=sum+mat[i][j]);
				sum=sum+mat[i][j];
				//System.out.println(sum);
				
			}
			//System.out.println(mat[i][j]+mat[i][j]);
			System.out.println(sum);
		}
		

	}

}
