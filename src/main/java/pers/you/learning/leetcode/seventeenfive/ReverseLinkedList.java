/*
【极客学院版】
LeetCode206 Reverse a singly linked list.
 */



package pers.you.learning.leetcode.seventeenfive;

import java.awt.HeadlessException;
import java.util.List;
import java.util.concurrent.RecursiveAction;

import org.junit.Test;

public class ReverseLinkedList {
    public void printList(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public ListNode arrayToList(int[] array) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int value : array) {
            p.next = new ListNode(value);
            p = p.next;
        }
        return head.next;
    }

    
    //非递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode pre = head;
            ListNode p = head.next;
            ListNode next = null;
            while (p != null) {
                next = p.next;
                p.next = pre;
                pre = p;
                p = next;
            }
            head.next = null;
            return pre;
        }
    }
    

    //递归
    public ListNode recursivelist(ListNode head){
        if(head==null || head.next==null){
            return head;
        }else{
            ListNode tail = recursive(head);
            head.next = null;
            return tail;
        }
    }
    
    
    public ListNode recursive(ListNode p){
        if(p.next==null){
            return p;
        }else{
            ListNode next = p.next;
            ListNode tail = recursive(next);
            next.next=p;
            return tail;
        }
    }

    @Test
    public void test(){
        int[] array = {1,2,3,4,5,6};
        ListNode list = arrayToList(array);
        printList(list);
//        list=reverseList(list);
        list=recursivelist(list);
        printList(list);
    }
    
}
