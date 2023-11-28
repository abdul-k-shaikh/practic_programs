package com.test.array;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Original array
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array: "); 
        int num = sc.nextInt(); 
        int arr[] = new int[num]; 
        System.out.print("Enter the elements: "); 
        for (int i = 0; i < num; i++) 
        { 
            arr[i] = sc.nextInt();
        }
        
        // Printing the array
        System.out.println("The array elements are : "+Arrays.toString(arr));

        int startIndex = 0, lastIndex = arr.length - 1;
        // Setting the mid index
        int midIndex = startIndex + (lastIndex-startIndex)/2;
        System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr[midIndex]);
    }
}