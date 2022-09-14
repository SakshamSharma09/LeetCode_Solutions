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
    public void reorderList(ListNode head) {
        ListNode tail = head;
        
        while(tail.next!=null){
            tail = tail.next;
        }
        
        ListNode temp = head;
        
        while(true){
            tail.next = temp.next;
            temp.next = tail;
            temp = tail.next;
            tail = tail.next;
            if(tail.next.next.next == temp){
                tail.next.next = null;
                break;
            }
            while(tail.next.next!=temp){
                tail = tail.next;
            }
        }
    }
}