/*
[1180. Count Substrings with Only One Distinct Letter]
Given a string s, return the number of substrings that have only one distinct letter.



Example 1:

Input: s = "aaaba"
Output: 8
Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
"aaa" occurs 1 time.
"aa" occurs 2 times.
"a" occurs 4 times.
"b" occurs 1 time.
So the answer is 1 + 2 + 4 + 1 = 8.
Example 2:

Input: s = "aaaaaaaaaa"
Output: 55


Constraints:

1 <= s.length <= 1000
s[i] consists of only lowercase English letters.
 */

package sourcecode_2023.May;

public class LeetCode1180_CountSubstringsWithOnlyOneDistinctLetter {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/25
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public int countLetters(String s) {
            int i = 0, count = 0, n = 0, l = s.length();

            while (i < l) {

                int j = i;
                while (i + 1 < l && s.charAt(i) == s.charAt(i + 1)) {
                    i += 1;
                }

                n = i - j + 1;
                count += n + n * (n - 1) / 2;
                i += 1;
            }

            return count;
        }
    }

}
