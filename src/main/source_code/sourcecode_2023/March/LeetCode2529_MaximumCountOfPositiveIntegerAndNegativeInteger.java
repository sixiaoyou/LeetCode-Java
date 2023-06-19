/*

[LeetCode2529. Maximum Count of Positive Integer and Negative Integer]
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.



Example 1:

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
Example 2:

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
Example 3:

Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.


Constraints:

1 <= nums.length <= 2000
-2000 <= nums[i] <= 2000
nums is sorted in a non-decreasing order.


Follow up: Can you solve the problem in O(log(n)) time complexity?
 */


package sourcecode_2023.March;

public class LeetCode2529_MaximumCountOfPositiveIntegerAndNegativeInteger {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/4
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public int maximumCount(int[] nums) {
        int start = 0;
        int l = nums.length - 1;
        int end = l;
        int res = l + 1;

        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] < 0) {
                if (mid + 1 < l && nums[mid + 1] > 0) {
                    int p = mid + 1;
                    int n = l - mid;
                    res = Math.max(p, n);
                    break;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > 0) {
                if (mid + 1 < l && nums[mid + 1] < 0) {
                    int p = mid + 1;
                    int n = l - mid;
                    res = Math.max(p, n);
                    break;
                } else {
                    end = mid - 1;
                }
            } else {
                int left = mid, right = mid;
                while (left > -1 && nums[left] == 0) {
                    if (left > -1 && nums[left] == 0) {
                        left -= 1;
                    }
                }

                while (right <= l && nums[right] == 0) {
                    if (right <= l && nums[right] == 0) {
                        right += 1;
                    }
                }

                start = right;
                end = left;
                res = Math.max(l - right + 1, left + 1);

            }

        }
        return res;
    }

}
