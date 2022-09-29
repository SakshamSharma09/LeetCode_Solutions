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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        if(root==null){
            return finalList;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        que.add(null);
        List<Integer> tempList = new ArrayList<Integer>();
        while(!que.isEmpty()){
            
            TreeNode temp = que.peek();
            que.remove();
            if(temp==null){
                finalList.add(tempList);
                tempList = new ArrayList<Integer>();
                if(!que.isEmpty()){
                    que.add(null);
                }
            }
            else{
                tempList.add(temp.val);
                if(temp.left!=null){
                    que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
            }
            
        }
        return finalList;
    }
}