package pers.you.learning.leetcode.seventeenfive;

/*
【极客学院版】
LeetCode24. Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */


public class SwapNodesInPairs {
    /**
     * Definition for singly-linked list. public class ListNode { int val;
     * ListNode next; ListNode(int x) { val = x; } }
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = new ListNode(0);
        ListNode zero = start;
        ListNode pre = head;
        ListNode p = pre.next;
        ListNode next = null;
        start.next = null;
        while (pre != null && p != null) {
            next = p.next;
            p.next = pre;
            pre.next = next;
            zero.next = p;
            if (next == null) {
                break;
            } else {
                zero = pre;
                pre = pre.next;
                p = pre.next;
            }

        }
        return start.next;
    }
}
