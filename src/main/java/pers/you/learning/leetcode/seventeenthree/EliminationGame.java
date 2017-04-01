package pers.you.learning.leetcode.seventeenthree;

public class EliminationGame {
	   public int lastRemaining(int n) {
	        //将其镜像对折为一个子问题，当前状态可以推出的下一个状态的结果，但是相反
	        return n==1?1:2*(n/2 + 1 - lastRemaining(n/2));

	    }
}
