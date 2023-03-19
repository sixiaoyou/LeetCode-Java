/*
[LeetCode2586. Count the Number of Vowel Strings in Range]
You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].



Example 1:

Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation:
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.
Example 2:

Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation:
- "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
- "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
- "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.


Constraints:

1 <= words.length <= 1000
1 <= words[i].length <= 10
words[i] consists of only lowercase English letters.
0 <= left <= right < words.length
 */

package sourcecode_2023.march;

public class LeetCode2586_CountTheNumberOfVowelStringsInRange {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/19
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public boolean get_flag(char lc, char rc) {
            char[] ac = {'a', 'e', 'i', 'o', 'u'};
            boolean lf = false;
            boolean rf = false;
            for (char sc : ac) {
                if (lc == sc) {
                    lf = true;
                }

                if (rc == sc) {
                    rf = true;
                }
            }
            return lf && rf;
        }


        public int vowelStrings(String[] words, int left, int right) {
            int count = 0;
            for (int i = left; i < right + 1; i++) {
                if (get_flag(words[i].charAt(0), words[i].charAt(words[i].length() - 1))) {
                    count += 1;
                }

            }
            return count;

        }
    }


}
