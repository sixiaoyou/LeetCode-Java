/*
 * 
LeetCode:414 Third Maximum Number
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */
package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Third {
	public static void main(String[] args){
		   List<Integer> nums=new ArrayList<Integer>();
	        long first,second,third;
	        first=second=third=Long.MIN_VALUE;
	        nums.add(5);
	        nums.add(2);
	        nums.add(4);
	        nums.add(1);
	        nums.add(3);
	        nums.add(6);
	        nums.add(0);
	        for (int num:nums){
	            if(num==first||num==second||num==third) continue;
	            if(num>first){
	            	third=second;
	            	second=first;
	            	first=num;
	            }
	            else if(num>second){
	            	third=second;
	            	second=num;
	            }
	            else if(num>third){
	            		third=num;
	            	}
	        	}
	        System.out.println((third==Long.MIN_VALUE)?(int)first:(int)third);
			}
	}

