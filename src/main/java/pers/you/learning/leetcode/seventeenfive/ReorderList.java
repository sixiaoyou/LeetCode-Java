/*
【极客学院版】
LeetCode143. Reorder List
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */



package pers.you.learning.leetcode.seventeenfive;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class ReorderList {

        public int getLength(ListNode head){
            int n=0;
            while (head!=null){
                head = head.next;
                n++;
            }
            return n;
        }
        
        public ListNode reverseListNode(ListNode p){
            ListNode p1 = p.next;
            ListNode p2 = p.next.next;
            while(p2!=null){
                ListNode next = p2.next;
                p2.next = p1;
                p1 = p2;
                p2 = next;
            }
            p.next.next = null;
            p.next = null;
            return p1;
        }
        
        public ListNode reorderProcess(ListNode head,ListNode p){
            ListNode start = new ListNode(0);
            ListNode first = head;
            start.next = head;
            ListNode next = null;
            boolean flag = true;
            while(p!=null){
                if(flag){
                    next = first.next;
                    first.next = p;
                    first = next;
                }else{
                    next = p.next;
                    p.next = first;
                    p = next;
                }
                flag=!flag;
            }
            return head;
        }
        

        public void reorderList(ListNode head) {
            if(head!=null&&head.next!=null){
                int n = getLength(head);
                int half = n/2;
                ListNode p = head;
                if (n%2!=0){
                    half++;
                }
                for(int i=1;i<half;i++){
                    p=p.next;
                }
                
                head=reorderProcess(head,reverseListNode(p));
            }
        }
    }
}
