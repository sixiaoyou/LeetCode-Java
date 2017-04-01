/*
LeetCode 343:Integer Break
 Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 */



package pers.you.learning.leetcode.seventeentwo;

public class IntegerBreak {

	public int integerBreak(int n) {
		int product=1;
		int product1;
		int product2;
		int product3;
		int max=0;
		int i=2;
		
		
		if(n==2){
			max=1;
		}
		else{
			while(n/i>=1){
				int n1=n%i;
				if(n1==0){
					product=(int)Math.pow(n/i, i);
				}
				else{
					product1=(int)Math.pow((int)n/i, i)*n1;
					product2=(int)Math.pow(i,(int)n/i)*n1;
					product3=(int)Math.pow((int)n/i, i-1)*(n/i+n1);
					product=(int)Math.max(product1, product2);
					product=(int)Math.max(product, product3);		
				}
				if(product>max){
					max=product;
				}
				i+=1;
			}
		}
	    return max;

	}

}
