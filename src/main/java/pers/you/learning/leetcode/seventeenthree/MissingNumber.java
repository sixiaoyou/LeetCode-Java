package pers.you.learning.leetcode.seventeenthree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MissingNumber {
	 public int missingNumberV1(int[] nums) {
		    List<Integer> list = new ArrayList<Integer>();
			List<Integer> list1 = new ArrayList<Integer>();
			for(int i=0;i<=nums.length;i++){
				if(i<nums.length){
					list.add(nums[i]);
				}
				list1.add(i);
			}
			list1.removeAll(list);
		    return list1.get(0);
	    }
	 
	 public int missingNumberV2(int[] nums) {
	        int a=0;
	        Arrays.sort(nums);
		   if(nums[nums.length-1]!=nums.length){
			    a=nums.length;
			}
			else{
				for(int i=0;i<nums.length;i++){
					if(i!=nums[i]){
						a=i;
						break;
					}
				}
			}
			return a;
		}
	
	//网友实现：http://bookshadow.com/weblog/2015/08/24/leetcode-missing-number/
	
	 public int missingNumberV3(int[] nums) {
			int sum=0;
			int total=nums.length;
			for(int i=0;i<nums.length;i++){
				sum+=nums[i];
				total+=i;
			}
			return total-sum;
		}
	 
	 public int missingNumberV4(int[] nums) {
	        int a=0;
	        int b=nums.length;
	        for(int i=0;i<nums.length;i++){
	            a^=nums[i];
	            b^=i;
	        }
	        return a^b;
		}
	
}
