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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        preorder(p,first); preorder(q,second);
        // System.out.println(first);
        // System.out.println(second);
        if(first.equals(second)){
            return true;
        }
        return false;
    }
    
    public void preorder(TreeNode root, ArrayList s){
        if(root==null){
            s.add(-1);
            return ;
        }
        s.add(root.val);
        preorder(root.left,s);
        preorder(root.right,s);
    }
    
}