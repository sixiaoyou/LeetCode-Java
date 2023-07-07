package sourcecode_2023.July;

/*
【To be Optimum】
[234. Palindrome Linked List]
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9


Follow up: Could you do it in O(n) time and O(1) space?
*/


import java.util.ArrayList;
import java.util.List;

public class LeetCode234_PalindromeLinkedList {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/7
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> l = new ArrayList<Integer>();
            while(head != null){
                l.add(head.val);
                head = head.next;
            }

            int start = 0, end = l.size() - 1;
            while(start < end){
                if(l.get(start) != l.get(end)){
                    return false;
                }
                start += 1;
                end -= 1;
            }

            return true;
        }
    }

}
