package com.murali.practice;

import java.util.Arrays;

public class MissingNumInArray {

	public static void main(String[] args) {
		int arrays[] = {1,2,3,4,5,6,7,8,9,11};
		int n = 11;
		int idealSum = (n*(n+1))/2;
		int arraysSum = Arrays.stream(arrays).sum();
		System.out.println("Missing Number is:" + (idealSum-arraysSum));	
		
	}
}
