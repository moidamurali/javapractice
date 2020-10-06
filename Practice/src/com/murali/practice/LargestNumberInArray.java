package com.murali.practice;

import java.util.Arrays;

public class LargestNumberInArray {
	static int arrays[] = {0,11,2,3,4,5,6,7,8,9, 12, 1};
	static int temp = 0;
	public static void main(String[] args) {
		for(int i=0;i<arrays.length;i++) {
			for(int j= i+1; j<arrays.length; j++) {
				if(arrays[i]>arrays[j]) {
					temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp;
				}
			}
		}
		int LargNumber = arrays[arrays.length-1];
		System.out.println("Largest Number is::" + LargNumber);
		int factSum = LargNumber*(LargNumber+1)/2;
		int arraySum = Arrays.stream(arrays).sum();
		int missingNumber = factSum-arraySum;
		System.out.println("Missing Number is::" + missingNumber);
	}
}
