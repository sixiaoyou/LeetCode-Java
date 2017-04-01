/*
LeetCode 69:Sqrt(x)
Implement int sqrt(int x).

Compute and return the square root of x.


Subscribe to see which companies asked this question
 */
package pers.you.learning.leetcode.seventeentwo;

public class Sqrt {
	public static void main(String[] args){
		int x=2;
		int low=0;
		int high=x;
		int j=0;
		while(low<=high){
		long mid=(long)(low+high)/2;
		if(mid*mid<x){
			low=(int)mid+1;
		}
		else if(mid*mid>x){
			high=(int)mid-1;
		}
		else{
				high=(int)mid;
			}
		}
		System.out.println(high);
	}
}
