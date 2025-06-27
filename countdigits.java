  package com.in;

import java.util.Scanner;

public class CountNoOfDig {
	
	static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		return count;
		
	}
	
	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int nextInt = sc.nextInt();
	System.out.println(count(nextInt));
	
}
}
