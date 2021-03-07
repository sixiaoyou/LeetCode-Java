package pers.you.learning.leetcode.eighteen;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public int fibonacci(int n) {
		// write your code here
		// write your code here
		int n1 = 0;
		int n2 = 1;
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(n1);
		l1.add(n2);
		if (n <= 2) {
			return l1.get(n - 1);
		}
		for (int i = 0; i < n - 2; i++) {
			l1.add(l1.get(l1.size() - 1) + l1.get(l1.size() - 2));

		}
		return l1.get(l1.size() - 1);

	}

}
