/*
LeetCode 409:Longest Palindrome
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
package pers.you.learning.leetcode.seventeentwo;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public int longestPalindrome(String s){
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		char[] s1 = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s1.length;i++){
			map.put(s1[i], map.getOrDefault(s1[i], 0)+1);
		}
		for(Integer value:map.values()){
			sum+=value;
			if(value%2!=0){
				count+=1;
				sum-=1;
			}
		}
		if(count>0){
			sum+=1;
		}
		return sum;
	}

}
