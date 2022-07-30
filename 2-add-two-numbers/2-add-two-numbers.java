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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum  = new ListNode();
        ListNode temp = sum;
        int carry = 0;
        //System.out.println(l1.next.val);
        while(l1!=null || l2!=null || carry!=0){
            int numl1 = (l1!=null) ? l1.val : 0;
            int numl2 = (l2!=null) ? l2.val : 0;
            
            int noSum = carry + numl1 + numl2;
            carry = noSum/10;
            temp.next = new ListNode(noSum%10);
            temp = temp.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return sum.next;
    }
}