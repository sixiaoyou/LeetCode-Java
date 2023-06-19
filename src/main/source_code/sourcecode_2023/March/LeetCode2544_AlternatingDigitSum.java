/*
[LeetCode2544. Alternating Digit Sum]
You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.



Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.


Constraints:

1 <= n <= 109
 */


package sourcecode_2023.March;

public class LeetCode2544_AlternatingDigitSum {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/21
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int alternateDigitSum(int n) {
            String s = String.valueOf(n);

            int total = 0;
            int lflag = s.length() % 2 == 1 ? 1 : -1;

            while (n != 0) {
                total += lflag * (n % 10);
                n /= 10;
                lflag *= -1;
            }
            return total;
        }
    }

}
