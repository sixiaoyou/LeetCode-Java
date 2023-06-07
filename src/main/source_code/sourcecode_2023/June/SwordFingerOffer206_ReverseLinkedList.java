package sourcecode_2023.June;

/*
[206. 反转链表]
给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

示例 1：
输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]

示例 2：
输入：head = [1,2]
输出：[2,1]

示例 3：
输入：head = []
输出：[]
 */

public class SwordFingerOffer206_ReverseLinkedList {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/7
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null) return head;
            ListNode rhead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return rhead;

        }
    }
}
