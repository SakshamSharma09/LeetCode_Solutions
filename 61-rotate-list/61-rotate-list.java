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
        if(head==null || head.next == null){
            return head;
        }
        ListNode count = head;
        int size=0;
        while(count!=null){
            size++;
            count= count.next;
        }
        k = k%size;
        while(k!=0){
            ListNode temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            ListNode tail = new ListNode(temp.next.val);
            tail.next = head;
            head = tail;
            temp.next = null;
            k--;
        }
        return head;
    }
}