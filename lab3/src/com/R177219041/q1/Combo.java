package com.R177219041.q1;

import java.util.Scanner;

public class Combo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Arr[] = new String[3];
		
		System.out.print("Enter the digits : ");
		for(int i=0;i<3;i++) {
			Arr[i] = sc.next();
		}	
		
		int l = Arr.length;
		System.out.println("All possible combinations are-->");
		for(int i =0;i<l;i++) {
			for(int j=0;j<l;j++) {
				for(int k=0;k<l;k++) {
					if(i!=j && j!=k && i!=k) {
						System.out.println(Arr[i]+Arr[j]+Arr[k]);
					}
				}
			}
			
		}
		

}
}
