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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        ListNode sortedList = new ListNode();
        ListNode temp3 = sortedList;
        
        while(temp1!=null && temp2!=null){
            ListNode node = new ListNode();
            if(temp1.val<=temp2.val){
                node.val = temp1.val;
                temp1 = temp1.next;
            }
            else{
                node.val = temp2.val;
                temp2 = temp2.next;
            }
            temp3.next = node;
            temp3 = temp3.next;
            node.next = null;
        }
        
        while(temp1!=null){
            ListNode node = new ListNode(temp1.val,null);
            temp3.next = node;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }
        
        while(temp2!=null){
            ListNode node = new ListNode(temp2.val,null);
            temp3.next = node;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        
        
        return sortedList.next;
    }
}