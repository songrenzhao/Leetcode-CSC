/*
21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

//Solution in Java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*
        ListNode cursor1 = l1;
        ListNode cursor2 = l2;
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while(cursor1 != null && cursor2 != null)
        {
            if(cursor1.val <= cursor2.val)
            {
                temp.next = cursor1;
                cursor1 = cursor1.next;
            }
            else
            {
                temp.next = cursor2;
                cursor2 = cursor2.next;
            }
            temp = temp.next;
        }
        if(cursor1 == null)
            temp.next = cursor2;
        else if(cursor2 == null)
            temp.next = cursor1;
        return head.next;
        */
        
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val < l2.val)
        {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
