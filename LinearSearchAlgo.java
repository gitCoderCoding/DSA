package com.dsa;

public class LinearSearchAlgo {
	public static void main(String[] args) {
		int[] nums = { 23, 45, 11, 10, 9, 8, 55, 63, 1, 4 };
		int target = 23;
		int ans = linearSearch2(nums, target);
		System.out.println(ans);
	}

	// search the target and return the true or false
	static boolean linearSearch3(int[] arr, int target) {
			if (arr.length == 0) {
				return false;
			}
			for (int ele : arr) {
				if(ele==target) {
					return true;
				}
			}
		
	return false;
	}

	// search the target and return the element
	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		//run for a loop
		for (int ele : arr) {
			if(ele==target) {
				return ele;
		}}
		
	return Integer.MAX_VALUE;
		}


	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}

		return -1;
	}
}