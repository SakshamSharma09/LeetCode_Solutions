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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null || (head.next==null && head.val==val)){
            return null;
        }
        ListNode temp = head;
        if(head.val==val){
            while(temp!=null && temp.val==val){
                temp = temp.next;
            }
        }
        if(temp==null){
            return null;
        }
        ListNode newHead = temp;
        ListNode tempNext = temp.next;
        while(tempNext!=null){
            if(tempNext.val==val){
                temp.next = tempNext.next;
                tempNext = tempNext.next;
            }
            else{
                temp = tempNext;
                tempNext = tempNext.next;
            }
        }   
        return newHead;
    }
}