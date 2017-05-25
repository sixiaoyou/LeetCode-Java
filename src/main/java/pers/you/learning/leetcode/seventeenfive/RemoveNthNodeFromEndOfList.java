/*
LeetCode19:Remove Nth Node From End of List
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */


package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class RemoveNthNodeFromEndOfList {
    // One Pass【极客学院版】
    public ListNode removeNthFromEndV1(ListNode head, int n) {
        if (head == null) {
            return head;
        } else {
            n++;
            ListNode pre = head;
            ListNode p2 = head;
            for (int i = 1; i <= n; i++) {
                if (p2 == null) {
                    return head.next;
                }
                p2 = p2.next;
            }
            while (p2 != null) {
                p2 = p2.next;
                pre = pre.next;
            }
            pre.next = pre.next.next;
            return head;
        }
    }

    //【网友实现】:https://discuss.leetcode.com/topic/7031/simple-java-solution-in-one-pass/2
    public ListNode removeNthFromEndV2(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        slow.next = head;
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return start.next;
    }

    // 非One Pass【极客学院版】
    public int getLength(ListNode head) {
        int l = 0;
        while (head != null) {
            head = head.next;
            l++;
        }
        return l;
    }

    public ListNode removeNthFromEndV3(ListNode head, int n) {
        int m = getLength(head);
        if (head == null) {
            return head;
        } else if (head.next == null || m == n) {
            head = head.next;
            return head;
        } else {

            ListNode p = head;
            for (int i = 1; i <= m - n - 1; i++) {
                p = p.next;
            }
            p.next = p.next.next;
            return head;
        }
    }
}
