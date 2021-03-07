package pers.you.learning.leetcode.eighteen;

public class SwapTwoIntegersinArray {
	 public void swapIntegers(int[] A, int index1, int index2) {
	        // write your code here
	        int temp = 0;
	        temp = A[index1];
	        A[index1] = A[index2];
	        A[index2] = temp;

	    }
}
