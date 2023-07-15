package com.dsa;

public class SearchInRange {
public static void main(String[] args) {
	int[] nums = { 23, 45, 11, 10, 9, 8, 55, 63, 1, 4 };
	int target = 4;
	int ans = linearSearch(nums, target,1,4);
	System.out.println(ans);
}
static int linearSearch(int[] arr, int target,int start,int end) {
	if (arr.length == 0) {
		return -1;
	}
	for (int index = start; index <= end; index++) {
		int element = arr[index];
		if (element == target) {
			return index;
		}
	}

	return -1;
}
}

