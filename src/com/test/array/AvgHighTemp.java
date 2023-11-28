package com.test.array;

import java.util.Scanner;

public class AvgHighTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days temprature?");
		int numDays = sc.nextInt();
		int temps[] = new int[numDays];
		int sum=0;
		for (int i = 0; i < numDays; i++) {
			System.out.println("Day "+ (i+1) + "'s high temp:");
			temps[i] = sc.nextInt();
			sum+=temps[i];
		} 
		double avg = sum/numDays;
		
		int aboveAvgTemp=0;
		//System.out.println();
		//count days above avg temp
		for(int i=0; i<numDays; i++) {
			if(temps[i]>avg) {
				aboveAvgTemp++;
				
			}
		}
		System.out.println("Avg tem is ="+ avg);
		System.out.println(aboveAvgTemp  + " above avg temp");
	}
	

}
