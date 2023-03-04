package com.test.pattern;
/*				ABCD
				BCDE
				CDEF
				DEFG
 * */
public class Pattern6 {

	public static void main(String[] args) {
		int n=4;
		//int p=1;
		for(int i=1; i<=4; i++) {
			char p=(char)('A'+i-1);
			for(int j=1; j<=4; j++){
				//char jthChar = (char)('A'+j-1);
				System.out.print(p);
				p=(char)(p+1);
			}
			System.out.println();
		}	

	}

}
