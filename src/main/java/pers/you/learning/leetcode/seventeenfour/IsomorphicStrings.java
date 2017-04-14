package pers.you.learning.leetcode.seventeenfour;

/*
网友实现:http://bookshadow.com/weblog/2015/04/29/leetcode-isomorphic-strings/
LeetCode 205:Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */



import java.util.HashMap;
import java.util.Map;


public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sourceMap = new HashMap<Character, Character>();
       Map<Character, Character> targetMap = new HashMap<Character, Character>();
       Character source = null;
       Character target = null;
       
       for(int i=0;i<s.length();i++){
           source = sourceMap.get(t.charAt(i));
           target = targetMap.get(s.charAt(i));
           if(target==null&&source==null){
               sourceMap.put(t.charAt(i), s.charAt(i));
               targetMap.put(s.charAt(i), t.charAt(i));
           }
           else if(!String.valueOf(target).equals(String.valueOf(t.charAt(i)))||!String.valueOf(source).equals(String.valueOf(s.charAt(i)))){  
               return false;
           }
       }
       return true;
   }
}
