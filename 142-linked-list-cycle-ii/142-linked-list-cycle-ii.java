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
        if(head==null || head.next==null){
            return null;
        }
        if(head.next==head){
            return head;
        }
        
        int lenCycle = lengthOfCycle(head);
        if(lenCycle==-1){
            return null;
        }
        System.out.println(lenCycle);
        ListNode second = head;
        
        while(lenCycle!=0){
            second = second.next;
            lenCycle--;
        }
        
        ListNode first = head;
        
        while(first!=second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
    
    public int lengthOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                break;
            }
        }
        
        if(fast!=slow){
            return -1;
        }
        int count=0;
        do{
            slow =slow.next;
            count++;
        } while(slow!=fast);
        
        return count;
    }
}