/*
[LeetCode1370. Increasing Decreasing String]

You are given a string s. Reorder the string using the following algorithm:

Pick the smallest character from s and append it to the result.
Pick the smallest character from s which is greater than the last appended character to the result and append it.
Repeat step 2 until you cannot pick more characters.
Pick the largest character from s and append it to the result.
Pick the largest character from s which is smaller than the last appended character to the result and append it.
Repeat step 5 until you cannot pick more characters.
Repeat the steps from 1 to 6 until you pick all characters from s.
In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after sorting s with this algorithm.

Example 1:

Input: s = "aaaabbbbcccc"
Output: "abccbaabccba"
Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
After steps 4, 5 and 6 of the first iteration, result = "abccba"
First iteration is done. Now s = "aabbcc" and we go back to step 1
After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
Example 2:

Input: s = "rat"
Output: "art"
Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.


Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
 */

package sourcecode_2023.March;

import java.util.*;

public class LeetCode1370_IncreasingDecreasingString {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/24
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class SolutionV1 {

        public Map<Character, Integer> counter(String s){
            Map<Character, Integer> map = new HashMap<Character, Integer>();

            for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            return map;
        }


        public List<Character> handleString(String s){
            Set<Character> set = new HashSet<Character>();
            List<Character> list = new ArrayList<Character>();
            for(char c1: s.toCharArray()){
                set.add(c1);
            }
            for(char c2: set){
                list.add(c2);
            }

            Collections.sort(list);
            return list;
        }

        public String sortString(String s) {
            Map<Character, Integer> map = counter(s);
            List<Character> list = handleString(s);

            int l = s.length(), sl = list.size();
            StringBuilder res = new StringBuilder();


            while(res.length() < l){

                for(int i = 0; i < sl; i++){
                    char tmp = list.get(i);
                    if(map.get(tmp) != 0){
                        res.append(list.get(i));
                        map.put(tmp, map.get(tmp) - 1);
                    }
                }

                for(int j = sl - 1; j >= 0; j--){
                    char tmp = list.get(j);
                    if(map.get(tmp) != 0){
                        res.append(list.get(j));
                        map.put(tmp, map.get(tmp) - 1);
                    }

                }

            }
            return res.toString();
        }
    }


    class SolutionV2 {
        public String sortString(String s) {
            int[] a = new int[26];
            for (char c : s.toCharArray()) {
                a[c - 'a'] += 1;
            }

            StringBuilder sb = new StringBuilder();

            while (sb.length() < s.length()) {

                for (int i = 0; i < 26; i++) {
                    if (a[i] != 0) {
                        sb.append((char) (i + 97));
                        a[i] -= 1;

                    }
                }


                for (int j = 25; j >= 0; j--) {
                    if (a[j] != 0) {
                        sb.append((char) (j + 97));
                        a[j] -= 1;
                    }
                }
            }

            return sb.toString();
        }
    }

}
