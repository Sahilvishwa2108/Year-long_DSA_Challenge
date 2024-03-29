/* 83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order. */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        for (int i = 0; i < size && temp != null; i++) {
            int valAtI = temp.val;
            ListNode prev = temp;
            ListNode curr = temp.next;
            while (curr != null && temp != null) {
                if (curr.val == valAtI) {
                    prev.next = curr.next;
                    curr = curr.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
