/*
[1030. Matrix Cells in Distance Order]
You are given four integers row, cols, rCenter, and cCenter. There is a rows x cols matrix and you are on the cell with the coordinates (rCenter, cCenter).

Return the coordinates of all cells in the matrix, sorted by their distance from (rCenter, cCenter) from the smallest distance to the largest distance. You may return the answer in any order that satisfies this condition.

The distance between two cells (r1, c1) and (r2, c2) is |r1 - r2| + |c1 - c2|.


Example 1:

Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0
Output: [[0,0],[0,1]]
Explanation: The distances from (0, 0) to other cells are: [0,1]
Example 2:

Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1
Output: [[0,1],[0,0],[1,1],[1,0]]
Explanation: The distances from (0, 1) to other cells are: [0,1,1,2]
The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
Example 3:

Input: rows = 2, cols = 3, rCenter = 1, cCenter = 2
Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
Explanation: The distances from (1, 2) to other cells are: [0,1,1,2,2,3]
There are other answers that would also be accepted as correct, such as [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].


Constraints:

1 <= rows, cols <= 100
0 <= rCenter < rows
0 <= cCenter < cols
 */


package sourcecode_2023.may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1030_MatrixCellsInDistanceOrder {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/13
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>();
        int ml = Math.max(rCenter, rows - 1 - rCenter) + Math.max(cCenter, cols - 1 - cCenter);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                int[] value = new int[]{i, j};
                List<int[]> l = map.getOrDefault(key, new ArrayList<>());
                l.add(value);
                map.put(key, l);
            }

        }


        List<int[]> lres = new ArrayList<int[]>();
        for (List<int[]> lv : map.values()) {
            for (int[] av : lv) {
                lres.add(av);
            }
        }

        int[][] res = new int[lres.size()][2];
        for (int j = 0; j < lres.size(); j++) {
            res[j] = lres.get(j);
        }
        return res;
    }

}

