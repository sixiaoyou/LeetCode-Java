package pers.you.learning.leetcode.seventeenfive;

/*
【九章算法】:http://www.jiuzhang.com/solutions/add-two-numbers/
LeetCode2:Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */



public class AddTwoNumbers {   
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      if(l1==null&&l2==null){
          return null;
      }
      
      ListNode head = new ListNode(0);
      ListNode point = head;
      int carry = 0;
      while(l1!=null&&l2!=null){
          int sum = carry + l1.val+l2.val;
          point.next = new ListNode(sum%10);
          carry = sum/10;
          l1 = l1.next;
          l2 = l2.next;
          point = point.next;
      }
      while(l1!=null){
          int sum = carry + l1.val;
          point.next = new ListNode(sum%10);
          carry = sum/10;
          l1 = l1.next;
          point = point.next;
      }
      while(l2!=null){
          int sum = carry + l2.val;
          point.next = new ListNode(sum%10);
          carry = sum/10;
          l2 = l2.next;
          point = point.next;
      }
      
      if (carry!=0){
          point.next = new ListNode(carry);
      }
      return head.next; 
    }
  
  public AddTwoNumbers(){
      ListNode idx = new ListNode(2);
      ListNode n=idx;
      n.next=new ListNode(4);
      n=n.next;
      n.next=new ListNode(3);
      n=n.next;
      ListNode idx1 = new ListNode(5);
      ListNode n1=idx1;
      n1.next=new ListNode(6);
      n1=n1.next;
      n1.next=new ListNode(4);
      n1=n1.next;
      ListNode a=addTwoNumbers(idx, idx1);
      while(a!=null){
          System.out.println(a.val);
          a=a.next;
      }
  }
  
  
  public static void main(String[] args){
     AddTwoNumbers aTwoNumbers = new AddTwoNumbers();
  }
}
