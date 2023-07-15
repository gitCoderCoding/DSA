package com.dsa;

public class MiniMaxSum {
	public static void main(String[] args) {
		int ar[] = { 5, 1, 7, 3, 4 };
		int maxsum = ar[0];
		int minsum = ar[0];
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > maxsum) {
				maxsum = ar[i];
			}
			if (ar[i] < minsum) {
				minsum = ar[i];
			}
			sum = sum + ar[i];
			maxsum = sum - minsum;
			minsum = sum - maxsum;
		}
		System.out.println(sum);
		System.out.println(maxsum = sum - minsum);
		System.out.println(minsum = sum - maxsum);
		System.out.println(maxsum + " " + minsum);
	}
}
