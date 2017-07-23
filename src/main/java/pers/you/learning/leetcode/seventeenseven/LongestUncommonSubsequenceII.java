package pers.you.learning.leetcode.seventeenseven;

/*
LeetCode522. Longest Uncommon Subsequence II
'''
【网友实现】http://bookshadow.com/weblog/2017/04/03/leetcode-longest-uncommon-subsequence-ii/
LeetCode522. Longest Uncommon Subsequence II
Given a list of strings, you need to find the longest uncommon subsequence among them. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

The input will be a list of strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.

Example 1:
Input: "aba", "cdc", "eae"
Output: 3
Note:

All the given strings' lengths will not exceed 10.
The length of the given list will be in the range of [2, 50].
'''
 */



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LongestUncommonSubsequenceII {

    public boolean isSubsequence(String p, String c) {
        int lp = p.length(), lc = c.length();
        int pp = 0, pc = 0;
        while (pp <= lp - 1 && pc <= lc - 1) {
            if (p.charAt(pp) == c.charAt(pc)) {
                pc += 1;
            }
            pp += 1;
        }
        return pc != lc;
    }

    public String[] SortArrayByLength(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                String temp;
                if (array[i].length() < array[j].length()) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public Map<String, Integer> getCounter(String[] array) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map;
    }

    public List<String> getSList(String[] array) {
        List<String> list = new ArrayList<String>();    
        List<String> reList = new ArrayList<String>();    
        for (String j : array) {
            list.add(j);
        }
//        如果无需排序的话，可以用HashSet  
        Set<String> set = new LinkedHashSet<String>();  
        set.addAll(list);  
        for(String i:set){
            reList.add(i);
        }
        return reList;
    }

    public int findLUSlength(String[] strs) {
        int count = 0; 
        String[] sortedStrs = SortArrayByLength(strs);
        List<String> list = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map = getCounter(sortedStrs);
        list = getSList(sortedStrs);
      
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) > 1) {
                continue;
            } else {
                for (int j = 0; j < i; j++) {
                    if (isSubsequence(list.get(j), list.get(i))) {
                        count += 1;
                    }
                }
                if (count == i) {
                    return list.get(i).length();
                }
                count = 0;
            }
        }
        return -1;

    }

}
