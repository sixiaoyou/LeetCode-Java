package sourcecode_2023.February;

/*
[2485. Find the Pivot Integer]
Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
Example 3:

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.

Constraints:

1 <= n <= 1000
 */

public class LeetCode2485_FindThePivotInteger {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.february
     * @CreateTime: 2023/2/24
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public int pivotIntegerV1(int n) {
        double result = Math.sqrt(n*(n+1)/2);
        return result % 1 == 0 ? (int) result : -1 ;
    }

    public int pivotIntegerV2(int n) {
        double val = Math.sqrt(n * (n + 1) / 2);
        for(int i = 1; i < n + 1; i++ ){
            if(i * i == (int)val * val){
                return i;
            }
        }
        return -1;
    }

    int left = 1, cv = 0;
    public int pivotIntegerV3(int n) {
        if(n == 1){
            return 1;
        }

        if(left == 1){
            cv = n;
        }

        for(int i = left; i < n + 1; i++ ){
            if(cv == 0 && i == n - 1){
                left = 1;
                return i;
            }

            cv -= i;

            if(cv > 0){
                continue;
            }else if(cv < 0){
                cv += n - 1;
                n -= 1;
            }else{
                left = i + 1;
                return pivotIntegerV3(n);
            }

        }

        left = 1;
        return -1;
    }

}
