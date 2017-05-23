package pers.you.learning.leetcode.seventeenfive;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        super();
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        super();
        this.val = val;
        this.next = next;
    }
    
    public  static ListNode arrayToList(int[] array) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int value : array) {
            p.next = new ListNode(value);
            p = p.next;
        }
        return head.next;
    }
    
    @Override
    public String toString() {
        return "ListNode [val=" + val + "]";
    }

}
