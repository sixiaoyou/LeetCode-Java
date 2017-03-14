/*
LeetCode 378:Kth Smallest Element in a Sorted Matrix
Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example:

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.
Note: 
You may assume k is always valid, 1 ≤ k ≤ n2.
 */
package pers.you.learning.leetcode.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementInASortedMatrix {
	 public int kthSmallest(int[][] matrix, int k) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix[i].length;j++){
					list.add(matrix[i][j]);
				}
			}
			Collections.sort(list);
		    return list.get(k-1);
	    }
}
