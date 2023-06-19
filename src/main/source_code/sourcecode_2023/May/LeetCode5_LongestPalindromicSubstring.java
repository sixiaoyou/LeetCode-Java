package sourcecode_2023.May;

/*
[LeetCode5. Longest Palindromic Substring]
Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */

public class LeetCode5_LongestPalindromicSubstring {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/3
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) {
                return "";
            }

            if (s.length() == 1) {
                return s;
            }


            int sl = s.length();
            int l = 0, maxLen = 0;
            int start = 0, end = sl - 1;
            char[] cs = s.toCharArray();

            while (end > -1 && start < sl && cs[end] == cs[start]) {
                end -= 1;
                start += 1;
            }

            if (start >= end) {
                return s;
            }

            for (int i = 0; i < sl; i++) {
                int l1 = expandaroundcentre(cs, sl, i, i);
                int l2 = expandaroundcentre(cs, sl, i, i + 1);
                l = Math.max(l1, l2);
                if (l > maxLen) {
                    start = i - (l - 1) / 2;
                    end = i + l / 2;
                    maxLen = l;
                }

            }
            return s.substring(start, end + 1);
        }


        public int expandaroundcentre(char[] c, int l, int start, int end) {
            while (start > -1 && end < l && c[start] == c[end]) {
                start--;
                end++;
            }

            return end - start - 1;


        }
    }

}
