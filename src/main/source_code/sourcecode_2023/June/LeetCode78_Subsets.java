/*
[78. Subsets]
Given an integer array nums of unique elements, return all possible
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]


Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */

package sourcecode_2023.June;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78_Subsets {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/28
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> path = new ArrayList<Integer>();
            backtracking(res, path, nums, 0);

            return res;
        }

        public void backtracking(
                List<List<Integer>> res, List<Integer> path, int[] nums, int startIndex){
            res.add(new ArrayList<>(path));

            for(int i = startIndex; i < nums.length; i++){

                path.add(nums[i]);
                backtracking(res, path, nums, i + 1);
                path.remove(path.size() - 1);
            }

        }
    }

}
