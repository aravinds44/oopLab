package com.R177219041.q2;

import java.lang.Math;
import java.util.Scanner;

public class SquareSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double Arr[] = new double[10];
		double sum=0;
		
		System.out.print("Enter the 10 numbers : ");
		for(int i=0;i<10;i++) {
			Arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			sum =sum+ Math.pow(Arr[i], 2);
		}
		
		System.out.println("Sum of squares ="+sum);

	}

}
