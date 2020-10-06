package com.murali.practice.algorithems;

import java.util.Scanner;

public class RedundentJump {

	public static void main(String[] args) {

		int sum = 0;
		 Scanner mScanner = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        int num = mScanner.nextInt();
	        int arr[] = new int[num];
	       

	        System.out.println("Enter the array elements:");
	        

	        for(int i = 0; i < num; i++)
	        {
	        	arr[i] = mScanner.nextInt();
	            sum = sum + arr[i];
	        }
	        
       System.out.print("Number of jumps to reach end is:: "  + minimumJumpsToReach(arr, 0, arr.length - 1)); 
	}
	
	
	static int minimumJumpsToReach(int arrayValues[], int source, int destination) 
   { 
       // If source and destination are equal 
       if (destination == source) 
           return 0; 
 
       // Nothing is reachable from the given source 
       if (arrayValues[source] == 0) 
           return Integer.MAX_VALUE; 
 
       // Travel through all the points reachable from arrayValues[length]. 
       // Recursively we will get the minimum number of jumps 
       // needed to reach arrayValues[destination] from these reachable points. 
       int minValue = Integer.MAX_VALUE; 
       for (int i = source + 1; i <= destination && i <= source + arrayValues[source]; i++) { 
           int jumps = minimumJumpsToReach(arrayValues, i, destination); 
           if (jumps != Integer.MAX_VALUE && jumps + 1 < minValue) 
        	   minValue = jumps + 1; 
       } 
       return minValue; 
   } 
}
