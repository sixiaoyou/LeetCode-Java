package pers.you.learning.leetcode.seventeeneight;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.junit.Test;

/*
'''
LeetCode594. Longest Harmonious Subsequence
We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.

Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

Example 1:
Input: [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].
Note: The length of the input array will not exceed 20,000.
'''
 */

//#[网友实现]:http://bookshadow.com/weblog/2017/05/21/leetcode-longest-harmonious-subsequence/
public class LongestHarmoniousSubsequence {
    
    public Map<Integer,Integer> getCounter(int[] nums){
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map;
    }
    
    
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        map = getCounter(nums);
        int max = 0,lastKey = 0,lastValue= 0;
        for(Entry<Integer, Integer> m : map.entrySet()){
            if(lastKey!=0&&m.getKey()-lastKey==1){
                max = Math.max(max, lastValue+m.getValue());
            }
            lastKey = m.getKey();
            lastValue = m.getValue();
        }
        
        return max;
    }
}
