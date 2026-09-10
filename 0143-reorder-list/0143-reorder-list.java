/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public void reorderList(ListNode head) {

        // find mid 
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;

        //disconnect
        slow.next = null;

        //reverse half
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // interleave
        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            ListNode leftNext = left.next;
            ListNode rightNext = right.next;

            left.next = right;
            right.next = leftNext;
            curr = leftNext;

            left = leftNext;
            right = rightNext;
        }
       
    }
}