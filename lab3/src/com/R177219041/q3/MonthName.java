package com.R177219041.q3;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		String month[]= {"January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		
		System.out.print("Enter the month number : ");
		n = sc.nextInt();
		
		System.out.print("\nMonth "+n+" is "+month[n-1]+".");
		

	}

} 