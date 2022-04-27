package Assignment;

import java.util.Arrays;

public class MinMaxFinder {
	public int[] findMinMax(int[] arr) {
		Arrays.sort(arr);
		int[] arr1 = new int[2];
		arr1[0]=arr[0];
		arr1[1]=arr[-1];
		return arr1;
	}

}
