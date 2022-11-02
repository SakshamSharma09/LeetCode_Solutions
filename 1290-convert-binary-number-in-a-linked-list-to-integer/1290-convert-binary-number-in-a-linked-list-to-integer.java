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
    public int getDecimalValue(ListNode head) {
        ListNode temp =head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int sum = 0;
        temp =head;
        while(temp!=null){
            sum += Math.pow(2,size-1)*temp.val;
            size--;
            temp =temp.next;
        }
        return sum;
    }
}