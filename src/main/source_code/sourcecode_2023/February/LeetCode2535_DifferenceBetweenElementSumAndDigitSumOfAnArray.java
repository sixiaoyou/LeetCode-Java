/*
【LeetCode2535. Difference Between Element Sum and Digit Sum of an Array】

You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.



Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.


Constraints:

1 <= nums.length <= 2000
1 <= nums[i] <= 2000
 */

package sourcecode_2023.February;


public class LeetCode2535_DifferenceBetweenElementSumAndDigitSumOfAnArray {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: year_2023
     * @CreateTime: 2023/2/19 17:00
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public int getSum(int[] nums) {
        int sum = 0;
        for (Integer j : nums) {
            sum += j;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for (Integer i : nums) {

            while (i >= 10) {
                sum += i % 10;
                i = Math.floorDiv(i, 10);
            }
            sum += i;

        }
        return Math.abs(sum - getSum(nums));
    }
}
