/*
【极客学院版】
 LeetCode141. Linked List Cycle
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */


package pers.you.learning.leetcode.seventeensix;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }else{
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next;
                fast = fast.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }     
    }
}
