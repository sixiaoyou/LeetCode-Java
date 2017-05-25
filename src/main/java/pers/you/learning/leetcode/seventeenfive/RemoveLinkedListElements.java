/*
 LeetCode203:Remove Linked List Elements
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */


package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;
import pers.you.learning.leetcode.seventeentwo.NextGreaterElementI;


public class RemoveLinkedListElements {
        
    //【极客学院版】
    public ListNode removeElementsV1(ListNode head, int val) {
            if(head==null){
                return null;
            }else{
                ListNode start = new ListNode(0);
                start.next=head;
                ListNode pre = start;
                ListNode p =head;
                while(p!=null){
                    if(p.val==val){
                        pre.next=p.next;
                        p=p.next;
                    }else{
                        pre=pre.next;
                        p=p.next;
                    }
                }
                return start.next;
            }     
        }   
    //【网友实现】:https://discuss.leetcode.com/topic/12580/3-line-recursive-solution/6
    public ListNode removeElementsV2(ListNode head, int val) {
        if(head==null) return null;
        head.next=removeElementsV2(head, val);
        return head.val==val ? head.next:head;
    }
    
    //【网友实现】:http://bookshadow.com/weblog/2015/04/24/leetcode-remove-linked-list-elements/
    public ListNode removeElementsV3(ListNode head, int val) {
        if(head==null){
            return null;
        }
            ListNode first = new ListNode(0);
            ListNode start = first;
        start.next=head;
        while(start!=null&&start.next!=null){
            if(start.next.val==val){
                start.next=start.next.next;
            }else{
            start=start.next;
            }
        }
        return first.next;
    }  
}
