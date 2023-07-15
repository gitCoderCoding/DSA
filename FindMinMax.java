package com.dsa;

import java.util.Arrays;
import java.util.Iterator;

public class FindMinMax {
	public static void main(String[] args) {
		int ar[] = { 7, 100, 5, 3, 6, 4 };
		int max = ar[0];
		int min = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];

			}
			if (ar[i] < min) {
				min = ar[i];

			}
		}
		System.out.println(min + " " + max);
		Arrays.sort(ar);
		System.out.println(ar[0] + " " + ar[ar.length - 1]);
	}
}
