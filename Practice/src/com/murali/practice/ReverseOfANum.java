package com.murali.practice;

public class ReverseOfANum {

	public static void main(String[] args) {
		int num = 2024;
		int temp =0;
		int rev =0;
		while(num!=0) {
			temp = num%10;
			num = num/10;
			rev = rev*10 + temp;
		}
		System.out.println("Reverser of a number is: " + rev);
	}
}
