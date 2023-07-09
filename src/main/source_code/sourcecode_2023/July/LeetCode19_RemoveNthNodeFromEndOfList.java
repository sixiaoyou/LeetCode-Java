package sourcecode_2023.July;


/*
[19. Remove Nth Node From End of List]
Given the head of a linked list, remove the nth node from the end of the list and return its head.


Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]


Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


Follow up: Could you do this in one pass?
 */
public class LeetCode19_RemoveNthNodeFromEndOfList {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/9
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int count = 0;
            ListNode slow = head, fast = head;

            while(fast != null){
                fast = fast.next;
                count += 1;

                if(count < n){
                    if(fast == null){
                        return head.next;
                    }
                }else{
                    if(fast == null){
                        return head.next;
                    }

                    while(fast != null && fast.next != null ){
                        fast = fast.next;
                        slow = slow.next;

                        if(fast.next == null){
                            slow.next = slow.next.next;
                            return head;
                        }
                    }
                    head.next = head.next.next;
                    return head;

                }
            }
            return head;
        }
    }

}
