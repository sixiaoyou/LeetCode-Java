package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode74. Search a 2D Matrix
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */


public class SearchA2DMatrix {
    public class Solution {
        public int searchRow(int[][] matrix, int m, int n, int target) {
            int start = 0;
            int end = m - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target == matrix[mid][n - 1]) {
                    return mid;
                } else if (target < matrix[mid][n - 1]) {
                    end -= 1;
                } else {
                    start += 1;
                }
            }
            return start;
        }

        public boolean searchCol(int[][] matrix, int row, int n, int target) {
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target == matrix[row][mid]) {
                    return true;
                } else if (target < matrix[row][mid]) {
                    end -= 1;
                } else {
                    start += 1;
                }
            }
            return false;
        }

        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int row = searchRow(matrix, m, n, target);
            if (row < 0 || row >= m) {
                return false;
            }
            return searchCol(matrix, row, n, target);
        }
    }
}
