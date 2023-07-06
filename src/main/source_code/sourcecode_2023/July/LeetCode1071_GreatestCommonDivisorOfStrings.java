package sourcecode_2023.July;

/*
[1071.Greatest Common Divisor of Strings]

For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""


Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
 */


public class LeetCode1071_GreatestCommonDivisorOfStrings {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/6
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int l1 = str1.length(), l2 = str2.length();
            int index = -1;
            for(int i = l1; i >= 0; i--){
                if(l1 % i == 0 && l2 % i == 0){
                    index = i;
                    break;
                }
            }

            if((str1 + str2).equals(str2 + str1)){
                return str1.substring(0, index);
            }
            return "";
        }
    }
}
