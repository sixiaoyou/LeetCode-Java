/*
LeetCode 162:Find Peak Element
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */

package pers.you.learning.leetcode.seventeenfour;

import java.util.Arrays;

import org.junit.Test;

public class FindPeakElement {

   

    public int findPeakElementV1(int[] nums) {
        int[] nums1=nums.clone();
        int r=0;
        Arrays.sort(nums);
        for(int i=0;i<nums1.length;i++){
            if(nums[i]==nums1[nums1.length-1]){
                r=i;
                break;
            }
        }
        return r;
    }

    // 网友实现：http://bookshadow.com/weblog/2014/12/06/leetcode-find-peak-element/
    public int findPeakElementV2(int[] nums) {
        int size = nums.length;
        return search(nums, 0, size - 1);
    }

    public int search(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        if (start + 1 == end) {
            if (nums[start] < nums[end]) {
                return end;
            } else {
                return start;
            }
        }
        int mid = (start + end) / 2;
        if (nums[mid] < nums[mid - 1]) {
            return search(nums, start, mid - 1);
        }
        if (nums[mid] < nums[mid + 1]) {
            return search(nums, mid + 1, end);
        }
        return mid;
    }
    
    public int findPeakElementV3(int[] nums) {
        int a = 0;
        if (nums.length == 1) {
            return 0;
        } else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                return 1;
            }
        } else {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    a = i;
                }
            }
            if (nums[nums.length - 1] > nums[nums.length - 2]) {
                a = nums.length - 1;
            }

        }
        return a;
    }
    
    
//    极客学院版
    public int findPeakElementV4(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return 0;
        }
        int start = 0;
        int end = n - 1;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
            
        }
        return start;
        
    }
    
    
    
@Test
public void test(){
            int[] nums={1,2,3,1};
            System.out.println(findPeakElementV1(nums));
            System.out.println(findPeakElementV2(nums));
            System.out.println(findPeakElementV3(nums));
    }
}
