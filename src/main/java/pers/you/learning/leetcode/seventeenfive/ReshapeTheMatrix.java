/*
LeetCode566:Reshape the Matrix
Total Accepted: 6969
Total Submissions: 11019
Difficulty: Easy
Contributors:
love_Fawn
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
Note:
The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.
 */







package pers.you.learning.leetcode.seventeenfive;


import org.junit.Test;
import org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;

public class ReshapeTheMatrix {

    public int[][] matrixReshapeV1(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m)
            return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++)
            res[i / c][i % c] = nums[i / m][i % m];
        return res;
    }

    public int[][] matrixReshapeV2(int[][] nums, int r, int c) {
        int count1 = 0;
        int count2 = 0;
        int[] nums1 = new int[c];
        int[][] nums2 = new int[r][c];

        if (nums.length * nums[0].length != r * c) {
            return nums;
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    count1 += 1;
                    nums1[count1 - 1] = nums[i][j];
                    int[] nums3 = nums1.clone();
                    if (count1 == c) {
                        count1 = 0;
                        count2 += 1;
                        nums2[count2 - 1] = nums3;
                    }
                }
            }
        }
        return nums2;
    }
}
