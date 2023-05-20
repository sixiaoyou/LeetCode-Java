/*
[1134. Armstrong Number]
Given an integer n, return true if and only if it is an Armstrong number.

The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n.



Example 1:

Input: n = 153
Output: true
Explanation: 153 is a 3-digit number, and 153 = 13 + 53 + 33.
Example 2:

Input: n = 123
Output: false
Explanation: 123 is a 3-digit number, and 123 != 13 + 23 + 33 = 36.


Constraints:

1 <= n <= 108
 */

package sourcecode_2023.may;

public class LeetCode1134_ArmstrongNumber {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/21
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public boolean isArmstrong(int n) {
            String sn = String.valueOf(n);
            int l = sn.length(), res = 0, tmpn = n;


            while(tmpn != 0){
                res += Math.pow(tmpn % 10, l);
                tmpn /= 10;
            }
            return res == n;
        }
    }
}
