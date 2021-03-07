package pers.you.learning.leetcode.eighteen;

/**
 * Description
 *	输出n以内所有的素数。	
 *	保证 n 是100以内的整数.
 * 
 */



import java.util.ArrayList;
import java.util.List;

public class FindPrime {
	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public List<Integer> prime(int n) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 2; i < n + 1; i++) {
			if (isPrime(i)) {
				l.add(i);
			}
		}
		return l;
		// write your code here
	}

}
