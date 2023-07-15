package com.dsa;

public class MissingNumber2 {
	public static void main(String[] args) {
		int ar[] = { 1, 3, 7, 6, 10, 9, 8, 5, 2 };
		int n = ar.length + 1;
		int sum = n * (n + 1) / 2;
		int add = 0;
		for (int i = 0; i < ar.length; i++) {
			add = add + ar[i];
		}
		int a = sum - add;
		System.out.println(a);
	}
}
