package pers.you.learning.leetcode.seventeenten;

import java.util.HashMap;
import java.util.Map;

/*
'''
【网友实现】
LeetCode13. Roman to Integer
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
'''
*/
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] arS = {'I','V','X','L','C','D','M'};
        int[] arI = {1,5,10,50,100,500,1000};
        int res = 0,pre=0;
        for(int i = 0;i<arS.length;i++){
            map.put(arS[i],arI[i]);
        }
        for(int i = s.length()-1;i>=0;i--){
            int num = map.get(s.charAt(i));
            if(num>=pre){
                res+=num;
            }else{
                res-=num;
            }
            pre = num;
        }
        return res;
    }
}
