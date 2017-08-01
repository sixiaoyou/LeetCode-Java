package pers.you.learning.leetcode.seventeeneight;

/*
'''
【网友实现】:http://bookshadow.com/weblog/2015/04/27/leetcode-count-primes/
LeetCode204. Count Primes
Count the number of prime numbers less than a non-negative number, n.

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.
'''

 */

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] iprime = new boolean[Math.max(n, 2)];
        iprime[0] = true;
        iprime[1] = true;

        int x = 2;
        while (x * x < n) {
            if (!iprime[x * x]) {
                int p = x * x;
                while (p < n) {
                    iprime[p] = true;
                    p += x;
                }

            }
            x += 1;
        }
        int count = 0;
        for (boolean b : iprime) {
            if (!b) {
                count += 1;
            }
        }
        return count;
    }
}
