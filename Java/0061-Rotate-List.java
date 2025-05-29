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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k == 0 || head == null || head.next == null)
            return head;

        ListNode dummy = head;
        int len = 0;
        while(head != null) {
            head = head.next;
            len++;
        }
        
        head = dummy;
        if(k % len != 0) {
            int stop = len - (k % len) - 1;
            for(int i = 0; i < stop; i++)
                head = head.next;

            ListNode temp = dummy;
            dummy = head.next;
            head.next = null;
            head = dummy;

            while(head.next != null)
                head = head.next;
            head.next = temp;
        }
        return dummy;
    }
}