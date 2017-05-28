/*
'''
【极客学院版】
 LeetCode86. Partition List
 Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

 You should preserve the original relative order of the nodes in each of the two partitions.

 For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
'''
 */

package pers.you.learning.leetcode.seventeenfive;


public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
       ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode p1 = left;
        ListNode p2 = right;
        while(head!=null){
            if(head.val<x){
                p1.next = head;
                p1 = p1.next;
            }else{
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p1.next =right.next;
        p2.next = null;
        return left.next;   
    }
    
}
