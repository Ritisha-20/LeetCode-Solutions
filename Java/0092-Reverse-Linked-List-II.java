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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        

        if(left == 1) {
            head = reverse(head, right - left);
        }
        else {
            int i = 1;
            ListNode dummy = head;
            while(dummy.next != null && i < left - 1) {
                dummy = dummy.next;
                i++;
            }
            System.out.print(dummy.val);
            dummy.next = reverse(dummy.next, right - left);
        }
        return head;
    }

    public ListNode reverse(ListNode head, int pos) {
        
        if(head == null)
            return head;

        ListNode dummy = head;

        int i = 0;
        ListNode prev = null;
        ListNode next = head.next;
        while(head.next != null && i < pos) {
            head.next = prev;
            prev = head;
            head = next;
            next = head.next;
            i++;
        }
        head.next = prev;

        dummy.next = next;
        return head;
    }
}