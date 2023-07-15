package com.dsa;

public class MissingNumber {
	public static void main(String[] args) {
		int ar[] = { 1, 3, 7, 6, 10, 9, 8, 5, 2 };
		for (int i = 1; i <= 10; i++) {
			boolean flag = check(ar, i);
			if (flag == false) {
				System.out.println(i);
			}
		}
	}

	private static boolean check(int[] ar, int key) {
		for (int i = 0; i < ar.length; i++) {
			if (key == ar[i]) {
				return true;
			}
		}
		return false;
	}
}
