package com.test.pattern;
/*				A
				BB
				CCC
				DDDD
 * */
public class Pattern5 {

	public static void main(String[] args) {
		int n=4;
		int p=1;
		for(int i=1; i<=4; i++, p++) {
			for(int j=1; j<=i; j++){
				char jthChar = (char)('A'+p-1);
				System.out.print(jthChar);
			}
			System.out.println();
		}	

	}

}
