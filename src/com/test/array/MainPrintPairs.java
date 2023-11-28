package com.test.array;

public class MainPrintPairs {

	public static void main(String[] args) {
		MainPrintPairs m = new MainPrintPairs();
		int[] customArray= {1,3,4,5};
		m.printPairs(customArray);
		

	}
	void printPairs(int [] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i]+ " " + array[j]);
			}
		}
	}

}

/*
 * 1 1
1 3
1 4
1 5
3 1
3 3
3 4
3 5
4 1
4 3
4 4
4 5
5 1
5 3
5 4
5 5

 * 
 * */
