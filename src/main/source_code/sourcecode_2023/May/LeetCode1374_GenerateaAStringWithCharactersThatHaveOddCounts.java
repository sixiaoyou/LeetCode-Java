/*
[1374. Generate a String With Characters That Have Odd Counts]


Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.



Example 1:

Input: n = 4
Output: "pppz"
Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
Example 2:

Input: n = 2
Output: "xy"
Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once. Note that there are many other valid strings such as "ag" and "ur".
Example 3:

Input: n = 7
Output: "holasss"


Constraints:

1 <= n <= 500
 */

package sourcecode_2023.May;

public class LeetCode1374_GenerateaAStringWithCharactersThatHaveOddCounts {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/24
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public String generateTheString(int n) {

            StringBuilder sb = new StringBuilder();
            if(n % 2 != 0){
                sb.append("a");
            }else{
                sb.append("b");
            }
            return "";

//            return sb.append("a".repeat(n- 1)).toString();

        }
    }
}
