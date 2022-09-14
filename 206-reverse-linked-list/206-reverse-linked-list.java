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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        ListNode newHead = tail;
        while(head.next!=tail){
            ListNode beforeTail = head;
            while(beforeTail.next!=tail){
                beforeTail = beforeTail.next;
            }
            tail.next = beforeTail;
            beforeTail.next = null;
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return newHead;
    }
}