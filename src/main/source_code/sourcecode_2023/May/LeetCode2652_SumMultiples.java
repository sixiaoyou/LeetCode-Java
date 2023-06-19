/*
[2652. Sum Multiples]
Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.



Example 1:

Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
Example 2:

Input: n = 10
Output: 40
Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
Example 3:

Input: n = 9
Output: 30
Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.


Constraints:

1 <= n <= 103
 */
package sourcecode_2023.May;

public class LeetCode2652_SumMultiples {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/8
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {

        public int S(int n, int i){
            int firstItem = i;
            int length = n / i;
            int lastItem = firstItem * length;

            if(n < i){
                return 0;
            }else{
                return (lastItem + firstItem) * length / 2;
            }
        }

        public int sumOfMultiples(int n) {
            return S(n, 3) + S(n, 5) + S(n, 7) - S(n, 15) - S(n, 21) - S(n, 35) + S(n, 105);
        }
    }

}
