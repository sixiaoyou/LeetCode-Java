package sourcecode_2023.June;
/*
[2710. Remove Trailing Zeros From a String]

Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.



Example 1:

Input: num = "51230100"
Output: "512301"
Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
Example 2:

Input: num = "123"
Output: "123"
Explanation: Integer "123" has no trailing zeros, we return integer "123".


Constraints:

1 <= num.length <= 1000
num consists of only digits.
num doesn't have any leading zeros.
 */


import java.util.HashMap;
import java.util.Map;

public class LeetCode2710_RemoveTrailingZerosFromAString {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/4
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public String removeTrailingZeros(String num) {
            int res = 0;
            for(int i = num.length() - 1 ; i > -1; i--){

                if(num.charAt(i) != '0'){
                    res = i;
                    break;
                }

            }

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            
            return num.substring(0,res + 1);
        }
    }


}
