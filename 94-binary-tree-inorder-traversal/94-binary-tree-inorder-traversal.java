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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> inorder = new ArrayList();  
        traversal(root,inorder);
        return inorder;
       
    }
    
    public List<Integer> traversal(TreeNode root,List<Integer> inorder){
        if(root!=null){
            traversal(root.left,inorder);
            inorder.add(root.val);
            traversal(root.right,inorder);
        }
        return inorder;
    }
    
}