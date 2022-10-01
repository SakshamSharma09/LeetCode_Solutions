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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int diamLeft = diameterOfBinaryTree(root.left);
        int diamRight = diameterOfBinaryTree(root.right);
        int diamLeftRight = height(root.left) + height(root.right);
        
        return Math.max(Math.max(diamLeft,diamRight),diamLeftRight);
    }
    
    public int height(TreeNode root) {
        return helper(root,0,0);
    }
    
    public int helper(TreeNode root,int count1,int count2){
        if(root == null){
            return 0;
        }
        return Math.max(helper(root.left,count1++,count2),helper(root.right,count1,count2++))+1;
    }
}