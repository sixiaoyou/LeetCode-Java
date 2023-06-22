package sourcecode_2023.June;

public class LeetCode1991_FindTheMiddleIndexInArray {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/22
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {

        public int getHalfSum(int[] nums) {
            int sum = 0;
            for (Integer i : nums) {
                sum += i;
            }

            return sum;

        }

        public int findMiddleIndex(int[] nums) {

            int lsum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (lsum * 2 + nums[i] == getHalfSum(nums)) {
                    return i;
                }
                lsum += nums[i];
            }

            return -1;
        }
    }
}
