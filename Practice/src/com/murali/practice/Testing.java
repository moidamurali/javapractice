package com.murali.practice;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "IVY ";
		String s2 = "Mobility";

		String s3 = s1 + s2;

		String s4 = "IVY Mobility";
		String s5 = s1 + "Mobility";

		System.out.println(" " + s5);
		if (s4.equals(s3)) {
			System.out.println(" s4 . Equal s3");
		}

		
		if (s4 == s3) {
			System.out.println(" s4 == s3");
		}
		

		
		if (s4.equals(s5)) {
			System.out.println(" s4 . Equal s5");
		}

		
		if (s4 == s5) {
			System.out.println(" s4 == s5");
		}
	}

}
