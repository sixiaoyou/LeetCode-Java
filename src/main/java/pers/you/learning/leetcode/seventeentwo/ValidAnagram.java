/*
LeetCode 242: Valid Anagram
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

package pers.you.learning.leetcode.seventeentwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {
    
    //【极客学院版本】
    public boolean isAnagramV1(String s, String t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null && t != null) {
            return false;
        } else if (s != null && t == null) {
            return false;
        } else {
            if (s.length() != toString().length()) {
                return false;
            }
            int n = s.length();
            int twentySix = 26;
            int[] sTable = new int[twentySix];
            int[] tTable = new int[twentySix];
            for (int i = 0; i < n; i++) {
                sTable[s.charAt(i) - 'a']++;
                tTable[t.charAt(i) - 'a']++;
            }
            for (int i = 0; i < twentySix; i++) {
                if (sTable[i] != tTable[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isAnagramV2(String s, String t) {
        String s1 = s;
        String t1 = t;

        char[] s2 = s1.toCharArray();
        char[] t2 = t1.toCharArray();
        Arrays.sort(s2);
        Arrays.sort(t2);
        String s3 = String.valueOf(s2);
        String t3 = String.valueOf(t2);
        Boolean ok = false;
        if (s.equals(t)) {
            ok = true;
        } else if (s2.length == t2.length && s3.equals(t3) && s != t) {
            if (s2.length > 1) {
                ok = true;
            }
        }
        return ok;
    }

}
