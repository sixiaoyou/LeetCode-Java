/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

示例 1：

输入：head = [1,3,2]
输出：[2,3,1]


限制：

0 <= 链表长度 <= 10000
 */

package sourcecode_2023.June;

public class SwordFingerOffer6_PrintLinkedListFromEndToEnd {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/6
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            int count = 0;
            ListNode rhead = head;

            while(head != null){
                ++count;
                head = head.next;
            }
            head = rhead;

            int[] res = new int[count];
            while(head != null){
                res[count - 1] = head.val;
                head = head.next;
                count -= 1;
            }
            return res;
        }
    }
}
