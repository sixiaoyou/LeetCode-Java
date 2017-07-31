package pers.you.learning.leetcode.seventeenseven;

import java.util.ArrayList;
import java.util.List;

/*
'''
LeetCode507. Perfect Number
We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.

Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
Example:
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
Note: The input number n will not exceed 100,000,000. (1e8)

'''
 */



public class PerfectNumber {
    public int sumList(List<Integer> list){
        int sum = 0;
        for(Integer i:list){
            sum+=i;
        }
        return sum;
    }
    
    
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int snum = (int)Math.sqrt(num);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 2;i<snum+1;i++){
            if(num%i==0){
                list.add(i);
                list.add(num/i);
            }
        }
        list.add(1);
        return sumList(list) == num;    
        
    }
    
    
    
    
}
