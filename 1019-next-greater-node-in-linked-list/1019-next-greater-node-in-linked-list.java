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
    public int[] nextLargerNodes(ListNode head) {
        if(head.next==null){
            return new int[]{0};
        }
        ListNode temp = head;
        Queue<Integer> queue = new LinkedList<Integer>();
        while(temp.next!=null){
            queue.add(greaterThanNode(temp.val,temp));
            temp = temp.next;
        }
        queue.add(0);
        
        int[] ans = new int[queue.size()];
        int i=0;
        while(!queue.isEmpty()){
            ans[i] = queue.remove();
            i++;
        }
        return ans;
    }
    
    public int greaterThanNode(int value, ListNode temp){
        while(temp.next!=null){
            if(temp.val>value){ 
                return temp.val;         
            }
            temp = temp.next;
        }
        if(temp.val>value){
            return temp.val;
        }
        return 0;
    }
}