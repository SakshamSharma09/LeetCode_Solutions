/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode second = NodeOfCycle(head);
        if(second==null){
            return null;
        }
        ListNode first = head;
        
        while(first!=second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
    
    public ListNode NodeOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return slow;
            }
        }
        return null;
    }
}