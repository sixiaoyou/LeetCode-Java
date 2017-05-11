/*
LeetCode 3:Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */


package pers.you.learning.leetcode.seventeenfive;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import pers.you.learning.leetcode.seventeenfour.LengthOfLastWord;

public class LongestSubstringWithoutRepeatingCharacters {
    
    //网友实现:http://bookshadow.com/weblog/2015/04/05/leetcode-longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstringV1(String s) {
        int start=0;
        int end=0;
        int ans=0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character i:s.toCharArray()){
            end+=1;
            map.put(i, map.getOrDefault(i,0)+1);
            while(map.get(i)>1){
                map.put(s.charAt(start), map.get(s.charAt(start))-1);
                start+=1;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;  
    }
    
    //网友实现:https://discuss.leetcode.com/topic/11632/a-python-solution-85ms-o-n
    public int lengthOfLongestSubstringV2(String s){
        int start = 0;
        int max=0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=null&&start<=map.get(s.charAt(i))){
                start=map.get(s.charAt(i))+1;
            }
            else{
                max=Math.max(max,i-start+1);
            }         
            map.put(s.charAt(i),i);
        }
        return max;
        
    }
}
