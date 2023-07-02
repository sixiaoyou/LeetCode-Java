/*
[884. Uncommon Words from Two Sentences]
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.



Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]


Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */

package sourcecode_2023.July;

import java.util.*;

public class LeetCode884_UncommonWordsFromTwoSentences {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/2
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {

        public String[] uncommonFromSentences(String s1, String s2) {
            String[] ls = (s1 + " " + s2).split(" ");
            Set<String> set = new HashSet<String>();
            Map<String, Integer> map = new HashMap<String, Integer>();

            for (String s : ls) {
                if (map.get(s) == null) {
                    map.put(s, 1);
                    set.add(s);
                } else {
                    if (map.get(s) == 1) {
                        set.remove(s);
                    }
                    map.put(s, 0);
                }

            }

            String[] res = new String[set.size()];
            int count = 0;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String s = it.next();
                res[count] = s;
                count += 1;
            }

            return res;

        }
    }


}
