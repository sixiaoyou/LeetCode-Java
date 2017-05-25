/*
Add LeetCode82:Remove Duplicates from Sorted List II
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */



package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class RemoveDuplicatesFromSortedListII {
 public ListNode deleteDuplicates(ListNode head) {
     ListNode start = new ListNode(0);
     ListNode pre=start;
     ListNode p=head;
     start.next=head;
     int flag=0;
     while(p!=null){
         if(p.val==p.next.val){
             flag=1;
         }else if(flag==1){
             pre.next=p.next;
             flag=0;
         }else{
             pre=pre.next;
         }
         p=p.next;
     }
     return start.next;  
    }
 
 @Test
 public void test(){
     int[] array={1};
     ListNode list = ListNode.arrayToList(array);
     ListNode delay = deleteDuplicates(list);
     while(delay!=null){
         System.out.print(delay.val);
         delay=delay.next;
     }
 }
}
