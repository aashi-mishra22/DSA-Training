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
        if (head == null || head.next == null || k == 0) return head;
        
        // 1. Length nikalo + tail nikalo
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        // 2. k ko mod karo
        k = k % len;
        if (k == 0) return head;
        
        // 3. Circle banao
        tail.next = head;
        
        // 4. Naya tail find karo: (len - k)th node
        ListNode newTail = head;
        for (int i = 1; i < len - k; i++) {
            newTail = newTail.next;
        }
        
        // 5. Circle todo
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}