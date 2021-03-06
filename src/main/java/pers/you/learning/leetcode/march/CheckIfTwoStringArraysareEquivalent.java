package pers.you.learning.leetcode.march;
/*
LeetCode 1662. Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 

Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */



public class CheckIfTwoStringArraysareEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s:word1){
            sb1.append(s);
        }
        for(String s:word2){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
