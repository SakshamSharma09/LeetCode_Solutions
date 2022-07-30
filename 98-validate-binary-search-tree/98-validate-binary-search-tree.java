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
    public boolean isValidBST(TreeNode root) {
        return BST(Long.MIN_VALUE,root,Long.MAX_VALUE);
    }
    public boolean BST(Long leftRange, TreeNode root, Long rightRange){
        if(root==null){
            return true;
        }
        if(root.val<leftRange || root.val>rightRange){
            return false;
        }
        return (BST(leftRange,root.left,root.val-1l) && BST(root.val+1l,root.right,rightRange));
    }
}