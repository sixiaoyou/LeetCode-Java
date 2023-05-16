/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.


Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.
 */

package sourcecode_2023.may;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1380_LuckyNumbersInAMatrix {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/16
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public List<Integer> luckyNumbers(int[][] matrix) {
            int res = 0, jndex = 0;
            int rl = matrix.length, cl = matrix[0].length;
            List<Integer> lres = new ArrayList<Integer>();


            for (int i = 0; i < rl; i++) {
                int row_min = 100000;
                for (int j = 0; j < cl; j++) {
                    if (matrix[i][j] < row_min) {
                        row_min = matrix[i][j];
                        res = row_min;
                        jndex = j;
                    }

                }

                int u = i - 1, d = i + 1;

                while (u > -1 || d < rl) {

                    if (u > -1 && matrix[u][jndex] > res) {
                        res = 0;
                        break;
                    }

                    if (d < rl && matrix[d][jndex] > res) {
                        res = 0;
                        break;
                    }

                    u -= 1;
                    d += 1;

                }

                if (res != 0) {
                    break;
                }

            }

            if (res != 0) {
                lres.add(res);
            }
            return lres;
        }
    }


}
