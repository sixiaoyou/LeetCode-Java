/*
[LeetCode2553. Separate the Digits in an Array]
Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.

To separate the digits of an integer is to get all the digits it has in the same order.

For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].


Example 1:

Input: nums = [13,25,83,77]
Output: [1,3,2,5,8,3,7,7]
Explanation:
- The separation of 13 is [1,3].
- The separation of 25 is [2,5].
- The separation of 83 is [8,3].
- The separation of 77 is [7,7].
answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.
Example 2:

Input: nums = [7,1,3,9]
Output: [7,1,3,9]
Explanation: The separation of each integer in nums is itself.
answer = [7,1,3,9].


Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
 */


package sourcecode_2023.february;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2553_SeparateTheDigitsInAnArray {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.february.LeetCode2553
     * @CreateTime: 2023/2/22
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public List<Integer> transfer_array(int[] nums) {
        List<Integer> ml = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> sl = new ArrayList<Integer>();
            while (nums[i] != 0) {
                sl.add(nums[i] % 10);
                nums[i] /= 10;
            }

            for (int j = sl.size() - 1; j >= 0; j--) {
                ml.add(sl.get(j));
            }
        }
        return ml;
    }

    public int[] get_resultV1(List<Integer> ml) {
        int[] res = new int[ml.size()];
        for (int k = 0; k <= ml.size() - 1; k++) {
            res[k] = ml.get(k);
        }
        return res;
    }

    public int[] get_resultV2(List<Integer> ml) {
        return Arrays.stream(ml.stream().toArray(Integer[]::new)).mapToInt(Integer::intValue).toArray();
    }

    public int[] get_resultV3(int[] nums) {
        StringBuffer sb = new StringBuffer();
        for (Integer i : nums) {
            sb.append(i);
        }
        int[] res = new int[sb.length()];
        char[] rec = sb.toString().toCharArray();

        for (int j = 0; j < rec.length; j++) {
            res[j] = rec[j] - '0';
        }
        return res;
    }

    public int[] separateDigitsV1(int[] nums) {
        return get_resultV1(transfer_array(nums));
    }

    public int[] separateDigitsV2(int[] nums) {
        return get_resultV2(transfer_array(nums));
    }

    public int[] separateDigitsV3(int[] nums) {
        return get_resultV3(nums);
    }
}
