/*
LeetCode 461:Hamming Distance 
 
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
 0 ≤ x, y < 231. 

Example: 
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

 */

package pers.you.learning.leetcode.two;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
    	int sum=0;
    	if(x>=0&&x<=Math.pow(2, 31)&&y>=0&&y<=Math.pow(2, 31)){
			int z=x^y;
			String z1=Integer.toBinaryString(z);
			char[] z2=z1.toCharArray();
			for(int i=0;i<z2.length;i++){
				if (z2[i]=='1'){
					sum+=1;
				}
			}
		}
		return sum;
	}
}
