package sourcecode_2023.July;


/*
[203. Remove Linked List Elements]
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []


Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
 */
public class LeetCode203_RemoveLinkedListElements {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/7
     * @Author: Sixiaoyou
     * @Version: 1.0
     */


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode start = new ListNode(0);
            ListNode p = start;
            start.next = head;

            while(p != null && p.next != null){
                if(p.next.val == val){
                    p.next = p.next.next;
                }else{
                    p = p.next;
                }
            }
            return start.next;
        }
    }

}
