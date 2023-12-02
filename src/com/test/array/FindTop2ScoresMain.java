package com.test.array;

public class FindTop2ScoresMain {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7 };
		FindTop2ScoresMain obj = new FindTop2ScoresMain();
		obj.findTopTwoScores(arr);

	}

	private void findTopTwoScores(int[] arr) {
		int firstHigest = Integer.MIN_VALUE;
		int secondHigest = Integer.MAX_VALUE;

		for (int score : arr) {
			if (score > firstHigest) {
				secondHigest = firstHigest;
				firstHigest = score;
			} else if (score > secondHigest && score < firstHigest) {
				secondHigest = score;
			}
		}
		System.out.println("firstHigest :" + firstHigest + " " + "secondHigest :" + secondHigest);

	}
/* the overall time complexity of the findTopTwoScores function is O(n)
 * */
}
