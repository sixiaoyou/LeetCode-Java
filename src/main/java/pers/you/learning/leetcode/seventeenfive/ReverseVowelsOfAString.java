/*
LeetCode345-Reverse Vowels of a String
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */




package pers.you.learning.leetcode.seventeenfive;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class ReverseVowelsOfAString {
    
    //【网友实现】:https://discuss.leetcode.com/topic/43412/java-standard-two-pointer-solution
    public String reverseVowelsV1(String s) {
        if (s == null || s.length() == 0)
            return s;
        String vowels = "aeiouAEIOU";
        char[] charS = s.toCharArray();
        int start = 0;
        int end = charS.length - 1;
        while (start < end) {
            while (start < end && !vowels.contains(charS[start] + "")) {
                start++;
            }

            while (start < end && !vowels.contains(charS[end] + "")) {
                end--;
            }
            char temp = charS[end];
            charS[end] = charS[start];
            charS[start] = temp;
            start++;
            end--;

        }
        return new String(charS);

    }

    public String reverseVowelsV2(String s) {
        String yString = "aeiouAEIOU";
        char[] charS = s.toCharArray();
        Pattern p = Pattern.compile("[aeiouAEIOU]");
        Stack<String> sk = new Stack<String>();
        Matcher m = p.matcher(s);
        Matcher m1 = p.matcher(s);

        while (m.find()) {
            sk.push(m.group());
        }
        for (int i = 0; i < charS.length; i++) {
            if (yString.contains(String.valueOf(charS[i]))) {
                charS[i] = sk.pop().charAt(0);
            }
        }

        return new String(charS);
    }
}
