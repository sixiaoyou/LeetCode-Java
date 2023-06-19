/*
[LeetCode2506. Count Pairs Of Similar Strings]
You are given a 0-indexed string array words.

Two strings are similar if they consist of the same characters.

For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.



Example 1:

Input: words = ["aba","aabb","abcd","bac","aabc"]
Output: 2
Explanation: There are 2 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
- i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'.
Example 2:

Input: words = ["aabb","ab","ba"]
Output: 3
Explanation: There are 3 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
- i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
- i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.
Example 3:

Input: words = ["nba","cba","dba"]
Output: 0
Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.


Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consist of only lowercase English letters.
 */


package sourcecode_2023.March;

import java.util.*;

public class LeetCode2506_CountPairsOfSimilarStrings {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march.LeetCode2506_CountPairsOfSimilarStrings
     * @CreateTime: 2023/3/25
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class SolutionV1 {

        public List<String> hw(String[] words) {

            List<String> ass = new ArrayList<String>();

            for (String word : words) {
                Set<Character> set = new HashSet<Character>();
                StringBuilder sb = new StringBuilder();

                for (char c1 : word.toCharArray()) {
                    set.add(c1);
                }

                set.stream().sorted();

                for (char c2 : set) {
                    sb.append(c2);
                }

                ass.add(sb.toString());
                sb = new StringBuilder();

            }

            return ass;
        }


        public int similarPairs(String[] words) {
            int count = 0;
            Set<String> set = new HashSet<String>();
            List<String> ls = new ArrayList<String>();
            Map<String, Integer> map = new HashMap<String, Integer>();

            ls = hw(words);
            StringBuilder a = new StringBuilder();


            for (String s : ls) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            for (String l : map.keySet()) {
                int tmp = map.get(l);
                count += tmp * (tmp - 1) / 2;
            }

            return count;
        }
    }


    class SolutionV2 {
        public int similarPairs(String[] words) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (String word : words) {
                int count = 0;
                for (char c : word.toCharArray()) {
                    count |= 1 << (c - 'a');
                }
                map.put(count, map.getOrDefault(count, 0) + 1);
            }

            int res = 0;
            for (int i : map.values()) {
                res += i * (i - 1) / 2;
            }

            return res;
        }
    }
}
