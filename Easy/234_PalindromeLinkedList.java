/*
234. Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(temp != null)
        {
            stack.push(temp.val);
            temp = temp.next;
        }
        while(stack.size() != 0)
        {
            if(stack.peek() != head.val)
                return false;
            head = head.next;
            stack.pop();
        }
        return true;
    }
}
