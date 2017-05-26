/*
LeetCode 61. Rotate List
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
 */


package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class RotateList {

    public int getLength(ListNode head) {
        ListNode p = head;
        int n = 0;
        while (p != null) {
            n++;
            p = p.next;
        }
        return n;
    }

    //【极客学院版】
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        } else {
            int n = getLength(head);
            if (k >= n) {
                k %= n;
            }
            if (k == 0) {
                return head;
            }
            int index = 1;
            ListNode pre = head;
            while (index < n - k) {
                pre = pre.next;
                index++;
            }
            ListNode start = pre.next;
            ListNode last = start;
            while (last.next != null) {
                last = last.next;
            }
            pre.next = null;
            last.next = head;
            return start;
        }
    }

    @Test
    public void test() {
        int[] array = { 1, 2, 3, 4, 5 };
        ListNode list = ListNode.arrayToList(array);
        System.out.println(getLength(list));

    }

}
