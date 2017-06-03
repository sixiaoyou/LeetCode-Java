/*
【极客学院版】
LeetCode160. Intersection of Two Linked Lists
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/

package pers.you.learning.leetcode.seventeensix;

public class IntersectionOfTwoLinkedLists {
    public int getLength(ListNode head) {
        int n = 0;
        while (head != null) {
            n++;
            head = head.next;
        }
        return n;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = getLength(headA);
        int n = getLength(headB);
        if (m == 0 || n == 0) {
            return null;
        } else {
            int k;
            ListNode p = headA;
            ListNode q = headB;
            if (m > n) {
                k = m - n;
                for (int i = 1; i <= k; i++) {
                    p = p.next;
                }
            } else if (n > m) {
                k = n - m;
                for (int i = 1; i <= k; i++) {
                    q = q.next;
                }
            }
            while (p != null || q != null) {
                if (p == q) {
                    return p;
                } else {
                    p = p.next;
                    q = q.next;
                }

            }
            return null;
        }
    }
}
