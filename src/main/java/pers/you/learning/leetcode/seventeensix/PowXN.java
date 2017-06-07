package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode50. Pow(x, n)
Implement pow(x, n).
 */

public class PowXN {
    public class Solution {
        public double pow(double x, int n) {
            if (n == 0) {
                return 1;
            } else {
                double half = pow(x, n >>> 1);
                if (n % 2 == 0) {
                    x = half * half;
                } else {
                    x = half * half * x;
                }
            }
            return x;
        }

        public double myPow(double x, int n) {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return x;
            } else {
                if (n > 0) {
                    return pow(x, n);
                } else {
                    return 1 / pow(x, -n);
                }
            }
        }
    }
}
