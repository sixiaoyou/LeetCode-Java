package sourcecode_2023.July;

/*
[1255. Maximum Score Words Formed by Letters]

Given a list of words, list of  single letters (might be repeating) and score of every character.

Return the maximum score of any valid set of words formed by using the given letters (words[i] cannot be used two or more times).

It is not necessary to use all characters in letters and each letter can only be used once. Score of letters 'a', 'b', 'c', ... ,'z' is given by score[0], score[1], ... , score[25] respectively.



Example 1:

Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
Output: 23
Explanation:
Score  a=1, c=9, d=5, g=3, o=2
Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
Words "dad" and "dog" only get a score of 21.
Example 2:

Input: words = ["xxxz","ax","bx","cx"], letters = ["z","a","b","c","x","x","x"], score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
Output: 27
Explanation:
Score  a=4, b=4, c=4, x=5, z=10
Given letters, we can form the words "ax" (4+5), "bx" (4+5) and "cx" (4+5) with a score of 27.
Word "xxxz" only get a score of 25.
Example 3:

Input: words = ["leetcode"], letters = ["l","e","t","c","o","d"], score = [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]
Output: 0
Explanation:
Letter "e" can only be used once.


Constraints:

1 <= words.length <= 14
1 <= words[i].length <= 15
1 <= letters.length <= 100
letters[i].length == 1
score.length == 26
0 <= score[i] <= 10
words[i], letters[i] contains only lower case English letters.
 */


public class LeetCode1255_MaximumScoreWordsFormedByLetters {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/3
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        private String[] words;
        private int[] score, left = new int[26];
        private int ans;

        public int maxScoreWords(String[] words, char[] letters, int[] score) {
            this.words = words;
            this.score = score;
            for (char c : letters) ++left[c - 'a'];
            dfs(words.length - 1, 0);
            return ans;
        }

        private void dfs(int i, int total) {
            if (i < 0) { // base case
                ans = Math.max(ans, total);
                return;
            }

            // 不选 words[i]
            dfs(i - 1, total);

            // 选 words[i]
            char[] s = words[i].toCharArray();
            boolean ok = true;
            for (char c : s) {
                if (left[c - 'a']-- == 0)
                    ok = false; // 剩余字母不足
                total += score[c - 'a']; // 累加得分
            }

            if (ok)
                dfs(i - 1, total);

            // 恢复现场
            for (char c : s)
                ++left[c - 'a'];
        }
    }



}
