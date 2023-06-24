package sourcecode_2023.June;

/*
[2595. Number of Even and Odd Bits]

You are given a positive integer n.

Let even denote the number of even indices in the binary representation of n (0-indexed) with value 1.

Let odd denote the number of odd indices in the binary representation of n (0-indexed) with value 1.

Return an integer array answer where answer = [even, odd].



Example 1:

Input: n = 17
Output: [2,0]
Explanation: The binary representation of 17 is 10001.
It contains 1 on the 0th and 4th indices.
There are 2 even and 0 odd indices.
Example 2:

Input: n = 2
Output: [0,1]
Explanation: The binary representation of 2 is 10.
It contains 1 on the 1st index.
There are 0 even and 1 odd indices.


Constraints:

1 <= n <= 1000
 */



public class LeetCode2595_NumberOfEvenAndOddBits {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/25
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int[] evenOddBit(int n) {
            String bn = Integer.toBinaryString(n);
            int even = 0, odd = 0;
            int l = bn.length();
            for (int i = l - 1; i > -1; i--) {
                if (bn.charAt(l - i - 1) == '1') {
                    if (i % 2 == 0) {
                        even += 1;
                    } else {
                        odd += 1;
                    }
                }
            }
            return new int[]{even, odd};
        }
    }
}
