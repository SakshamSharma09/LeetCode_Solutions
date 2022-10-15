/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(isBalancedFast(root)[0] == 1){
            return true;
        }
        return false;
    }
    
    public int[] isBalancedFast(TreeNode root){
        if(root==null){
            return new int[]{1,0};
        }
        
        int[] left = isBalancedFast(root.left);
        int[] right = isBalancedFast(root.right);
        
        int isLeftBalanced = left[0];
        int isRightBalanced = right[0];
        int isCurrBalanced = Math.abs(left[1]-right[1]);
        
        int[] ans = new int[2];
        if(isLeftBalanced==1 && isRightBalanced==1 && isCurrBalanced <2){
            ans[0] = 1;
        }
        else{
            ans[0] = 0;
        }
        ans[1] = Math.max(left[1],right[1]) + 1;
        return ans;
    }
}