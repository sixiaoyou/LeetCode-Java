package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode264. Ugly Number II
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number, and n does not exceed 1690.
 */


import java.util.LinkedList;
import java.util.Queue;

public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int i = 1, count = 1;
        Queue<Integer> queue2 = new LinkedList<Integer>();
        Queue<Integer> queue3 = new LinkedList<Integer>();
        Queue<Integer> queue5 = new LinkedList<Integer>();
        while (count < n) {
            queue2.offer(i * 2);
            queue3.offer(i * 3);
            queue5.offer(i * 5);
            int min2 = queue2.peek();
            int min3 = queue3.peek();
            int min5 = queue5.peek();
            int minest = Math.min(Math.min(min2, min3), min5);
            if (min2 == minest) {
                queue2.poll();
            }

            if (min3 == minest) {
                queue3.poll();
            }

            if (min5 == minest) {
                queue5.poll();
            }

            i = minest;
            count++;
        }
        return i;

    }

}
