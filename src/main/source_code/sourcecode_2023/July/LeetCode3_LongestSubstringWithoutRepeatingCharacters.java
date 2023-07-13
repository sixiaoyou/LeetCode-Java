package sourcecode_2023.July;

import java.util.HashMap;
import java.util.Map;

/*
[3. Longest Substring Without Repeating Characters]
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LeetCode3_LongestSubstringWithoutRepeatingCharacters {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/13
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int lengthOfLongestSubstring(String s) {

            int start = -1;
            int max = 0;
            char[] cs = s.toCharArray();
            Map<Character, Integer> map = new HashMap<Character, Integer>();

            for(int i = 0; i < cs.length; i++){
                Integer c = map.get(cs[i]);
                if(c != null && start < c){
                    start = c;
                    map.put(cs[i], i);
                }else{
                    map.put(cs[i], i);
                    if(i - start > max){
                        max = i - start;
                    }

                }

            }
            return max;

        }
    }
}
