/*
[LeetCode2574. Left and Right Sum Differences]

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.



Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].


Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
 */
package sourcecode_2023.March;

public class LeetCode2574_LeftAndRightSumDifferences {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/19
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {

        public int[] leftRigthDifference(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            int lsum = 0, rsum = 0;
            for (int i : nums) {
                rsum += i;
            }

            for (int i = 0; i < n; i++) {
                rsum -= nums[i];
                res[i] = Math.abs(lsum - rsum);
                lsum += nums[i];
            }
            return res;
        }
    }
    
}
