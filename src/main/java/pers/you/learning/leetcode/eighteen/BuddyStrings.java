package pers.you.learning.leetcode.eighteen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
'''
LeetCode859. Buddy Strings
Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.



Example 1:

Input: A = "ab", B = "ba"
Output: true
Example 2:

Input: A = "ab", B = "ab"
Output: false
Example 3:

Input: A = "aa", B = "aa"
Output: true
Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
Example 5:

Input: A = "", B = "aa"
Output: false


Note:

0 <= A.length <= 20000
0 <= B.length <= 20000
A and B consist only of lowercase letters.
'''
 */

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        Set<Character> sa = new HashSet<Character>();
        List<Character> ls = new ArrayList<Character>();
        if(A.length()!=B.length()){
            return false;
        }
        for(int i=0;i<A.length();i++){
            sa.add(A.charAt(i));
            if(A.charAt(i)!=B.charAt(i)){
                ls.add(A.charAt(i));
                ls.add(B.charAt(i));
            }
        }
        if(A.equals(B)){
            if(sa.size()==A.length()){
                return false;
            }
            return true;
        }
        if(ls.size()!=4){
            return false;
        }
        if(ls.get(0)!=ls.get(3)||ls.get(1)!=ls.get(2)){
            return false;
        }
        return true; 
    }
}
