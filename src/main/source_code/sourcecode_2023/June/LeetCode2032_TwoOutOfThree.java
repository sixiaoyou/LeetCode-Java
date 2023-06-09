package sourcecode_2023.June;

/*
[2032. Two Out of Three]
Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.


Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.


Constraints:

1 <= nums1.length, nums2.length, nums3.length <= 100
1 <= nums1[i], nums2[j], nums3[k] <= 100
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode2032_TwoOutOfThree {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/9
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int[] Counter(int[] nums){
            int[] count = new int[101];
            for(Integer i: nums){
                count[i] = 1;
            }
            return count;
        }

        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            int[] count1 = Counter(nums1);
            int[] count2 = Counter(nums2);
            int[] count3 = Counter(nums3);

            List<Integer> res = new ArrayList<Integer>();

            for(int i = 0; i < 101; i++){
                if(count1[i] + count2[i] + count3[i] > 1){
                    res.add(i);
                }
            }

            return res;
        }
    }
}
