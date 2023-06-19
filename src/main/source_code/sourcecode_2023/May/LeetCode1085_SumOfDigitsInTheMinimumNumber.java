/*
[1085. Sum of Digits in the Minimum Number]
Given an integer array nums, return 0 if the sum of the digits of the minimum integer in nums is odd, or 1 otherwise.


Example 1:

Input: nums = [34,23,1,24,75,33,54,8]
Output: 0
Explanation: The minimal element is 1, and the sum of those digits is 1 which is odd, so the answer is 0.
Example 2:

Input: nums = [99,77,33,66,55]
Output: 1
Explanation: The minimal element is 33, and the sum of those digits is 3 + 3 = 6 which is even, so the answer is 1.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */


package sourcecode_2023.May;

public class LeetCode1085_SumOfDigitsInTheMinimumNumber {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/19
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int getNumsMin(int[] nums){
            int min = 101;
            for(Integer i: nums){
                min = Math.min(min, i);
            }
            return min;

        }

        public int sumOfDigits(int[] nums) {
            int s = 0;
            int min = getNumsMin(nums);
            while(min != 0){
                s += min % 10;
                min /= 10;
            }

            return s % 2 == 0 ? 1 : 0;
        }
    }


}
