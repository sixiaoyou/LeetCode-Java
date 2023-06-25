package sourcecode_2023.June;

/*
[2475. Number of Unequal Triplets in Array]
You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the following conditions:

0 <= i < j < k < nums.length
nums[i], nums[j], and nums[k] are pairwise distinct.
In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
Return the number of triplets that meet the conditions.



Example 1:

Input: nums = [4,4,2,4,3]
Output: 3
Explanation: The following triplets meet the conditions:
- (0, 2, 4) because 4 != 2 != 3
- (1, 2, 4) because 4 != 2 != 3
- (2, 3, 4) because 2 != 4 != 3
Since there are 3 triplets, we return 3.
Note that (2, 0, 4) is not a valid triplet because 2 > 0.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: No triplets meet the conditions so we return 0.


Constraints:

3 <= nums.length <= 100
1 <= nums[i] <= 1000
 */


import java.util.HashMap;
import java.util.Map;

public class LeetCode2475_NumberOfUnequalTripletsInArray {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/26
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int unequalTriplets(int[] nums) {

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();


            for(Integer i: nums){
                map.put(i, map.getOrDefault(i, 0) + 1);

            }

            int l = nums.length, t = 0;
            int count = 0;
            for(Integer j: map.values()){

                count += t * j * (l - j - t);
                t += j;

            }


            return count;
        }
    }
}
