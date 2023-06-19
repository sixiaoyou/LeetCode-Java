package sourcecode_2023.May;

import java.util.HashMap;
import java.util.Map;

/*
[面试题 01.04. Palindrome Permutation LCCI]
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.



Example1:

Input: "tactcoa"
Output: true（permutations: "tacocat"、"atcocta", etc.）
 */


public class LeetCode_PalindromePermutationLCCI {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/3
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public boolean canPermutePalindrome(String s) {
            int count = 0;
            char[] array = s.toCharArray();
            Map<Character, Integer> map = new HashMap<Character, Integer>();

            for(char c: array){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for(int i: map.values()){
                if(i % 2 == 1){
                    count += 1;
                }

                if(count > 1){
                    return false;
                }
            }
            return true;

        }
    }
}
