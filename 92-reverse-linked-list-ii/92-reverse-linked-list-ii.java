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
        if(left==right || head==null || head.next == null){
            return head;
        }
        ListNode befStart = null;
        ListNode start = head;
        
        int count=1;
        while(count!=left){
            befStart = start;
            start = start.next;
            count++;
        }
        count = left;
        
        ListNode prev = start;
        ListNode present = prev.next;
        ListNode future = present.next;
        
        while(count!=right){
            present.next = prev;
            prev = present;
            present = future;
            if(future!=null){
                future = future.next;
            }
            count++;
        }
        start.next = present;
        if(befStart !=null){
            befStart.next = prev;
        }
        if(left==1){
            head = prev;
        }
        
        return head;
    }
}