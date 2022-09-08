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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count=1;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        
        if(count==1){
            return null;
        }
        if(count-n==0){
            return head.next;
        }
        temp = head;
        
        while(count-n!=1){
            temp = temp.next;
            count--;
        }
        
        if(temp.next.next == null){
            temp.next = null;
        }
        else{
            temp.next = temp.next.next;
        }
        return head;
    }
}