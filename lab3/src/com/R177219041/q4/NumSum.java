package com.R177219041.q4;

public class NumSum {
	
	
	public static void main(String[] arg) {
		
		int sum=0;
		System.out.print("Sum of numbers btw 40 and 250 thats are divisible by 5 = ");
		
		for(int i=45;i<250;i+=5) {
			sum+=i;
		}
		System.out.print(sum);
	}

}
