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
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode next;
        while(temp!= null){
            next = temp.next;
            temp.next = prev;
            prev= temp;
            temp = next;
        }
        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        ListNode start  = reverse(head);
        ListNode temp = start;
        while(temp!=null && temp.next != null){
            if(temp.val > temp.next.val ){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }          
        }
    
        return reverse(start);
    }
}