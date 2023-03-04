package com.test.pattern;
/*              ABCD
				ABCD
				ABCD
				ABCD
 * */
public class Pattern4 {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++){
				char jthChar = (char)('A'+j-1);
				System.out.print(jthChar);
			}
			System.out.println();
		}	

	}

}
