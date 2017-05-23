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

    @Override
    public String toString() {
        return "ListNode [val=" + val + "]";
    }

}
