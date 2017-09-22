package pers.you.learning.leetcode.seventeennine;

import java.util.HashMap;
import java.util.Map;

/*
LeetCode677. Map Sum Pairs
Implement a MapSum class with insert, and sum methods.

For the method insert, you'll be given a pair of (string, integer). The string represents the key and the integer represents the value. If the key already existed, then the original key-value pair will be overridden to the new one.

For the method sum, you'll be given a string representing the prefix, and you need to return the sum of all the pairs' value whose key starts with the prefix.

Example 1:
Input: insert("apple", 3), Output: Null
Input: sum("ap"), Output: 3
Input: insert("app", 2), Output: Null
Input: sum("ap"), Output: 5

 */

public class MapSumPairs {
    public Map<String,Integer> map;
    /** Initialize your data structure here. */
    public MapSumPairs() {
        map = new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public boolean compare(String s,String prefix,int length){
        if(s.length()<length) return false;
        for(int i = 0;i<length;i++){
            if(s.charAt(i)!=prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public int sum(String prefix) {
        int length = prefix.length();
        int sum = 0;
        for(String s:map.keySet()){
            if(compare(s,prefix,length)){
                sum+=map.get(s);
            }
        }
        return sum;
    }
}
