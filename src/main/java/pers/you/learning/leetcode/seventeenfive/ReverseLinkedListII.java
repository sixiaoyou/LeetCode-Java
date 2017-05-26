/*
LeetCode92:Reverse Linked List II
 Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 */



package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        } else if (m == n) {
            return head;
        } else {
            ListNode start = new ListNode(0);
            ListNode first = start;
            start.next = head;
            int k = 1;
            while (k < m) {
                first = first.next;
                k++;
            }
            ListNode pre = first.next;
            ListNode p = pre.next;
            ListNode next = null;
            final ListNode top = pre;
            while (k < n) {
                next = p.next;
                p.next = pre;
                pre = p;
                p = next;
                k++;
            }
            top.next = p;
            first.next = pre;
            return start.next;
        }
    }

    @Test
    public void test() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode list = ListNode.arrayToList(array);
        ListNode returnList = reverseBetween(list, 3, 6);
        while (returnList != null) {
            System.out.print(returnList.val);
            returnList = returnList.next;
        }

    }

}
