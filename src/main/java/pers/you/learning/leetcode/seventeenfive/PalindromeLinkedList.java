/*
 LeetCode234-Palindrome Linked List
 Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
*/



package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class PalindromeLinkedList {
        public int getLength(ListNode head){
            int n = 0;
            while (head!=null){
                head = head.next;
                n++;
            }
            return n;
        }
        
        public boolean judgeProcess(ListNode head,ListNode p){
            ListNode p1 = p.next;
            ListNode p2 = p.next.next;
            while(p2!=null){
                ListNode next = p2.next;
                p2.next = p1;
                p1 = p2;
                p2 = next;
            }
            p.next.next=null;
            p.next=p1;
            while(p1!=null){
                if(head.val!=p1.val){
                    return false;
                }
                head = head.next;
                p1= p1.next;
            }

                  return true;
          
        }
        
        
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null){
                return true;
            }
            int count = 0;
            int n = getLength(head);
            ListNode pre = head;
            ListNode p = head.next;
            if(n%2==0){
                if(n==2){
                    if(head.val!=head.next.val){
                        return false;
                    }
                    return true;
                }
                else{
                    while(2+count!=n/2){
                        p=p.next;
                        count+=1;
                    }
                }
            }else{
                while(count!=n/2-1){
                    p=p.next;
                    count+=1;
                }
            }
            return judgeProcess(head,p);
            
        }
}
