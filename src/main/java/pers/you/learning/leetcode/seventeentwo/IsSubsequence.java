/*
LeetCode 392:Is Subsequence
Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.

Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?
 */



package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IsSubsequence {

	public boolean isSubsequenceV1(String s, String t) {
		// TODO Auto-generated method stub
		int index = -1;
		boolean ok = false;
		ArrayList listT = new ArrayList<Character>();
		for (int i = 0; i < t.length(); i++) {
			listT.add(t.charAt(i));
		}
		for (int j = 0; j < s.length(); j++) {
			if (!listT.contains(s.charAt(j))) {
				return false;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < t.length(); j++) {
				if (s.charAt(i) == t.charAt(j) && j > index) {
					index = j;
					ok = true;
					break;
				}
			}
			if (!ok) {
				return false;
			}
			ok = false;
		}
		return true;

	}

	//网友实现
	public boolean isSubsequenceV2(String s, String t) {
		int index = 0;
		if (s == null || s.length() < 0) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			while (t.length() > index && t.charAt(index) != ch) {
				index++;
			}
			if (index >= t.length()) {
				return false;
			}
			index++;
		}
		return true;
		
	}

	
//网友实现
	 public boolean isSubsequenceV3(String s, String t) {
			Queue<Character> queue = new LinkedList<Character>();
			for(int i=0;i<s.length();i++){
			queue.add(s.charAt(i));
			}
			for(int j=0;j<t.length();j++){
				if(queue.isEmpty()){
				    return true;
			}
				if(t.charAt(j)==queue.peek()){
						queue.poll();
			}
			
		}
	        return queue.isEmpty();
	    }
}