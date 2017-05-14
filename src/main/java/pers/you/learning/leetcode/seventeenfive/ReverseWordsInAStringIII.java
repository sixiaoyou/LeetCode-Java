/*
【网友实现】：https://discuss.leetcode.com/topic/85911/easiest-java-solution-9ms-similar-to-reverse-words-in-a-string-ii
LeetCode557-Reverse Words in a String III
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.


 */



package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] charS = s.toCharArray();
        int i = 0;
        for (int j = 0; j < charS.length; j++) {
            if (charS[j] == ' ') {
                reverse(charS, i, j - 1);
                i = j + 1;
            }
        }
        reverse(charS, i, charS.length - 1);
        return new String(charS);
    }

    public void reverse(char[] s, int l, int r) {
        while (l < r) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }
    }
}
