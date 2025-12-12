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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricbyPart(root.right,root.left);
    }
    private boolean isSymmetricbyPart(TreeNode r , TreeNode q){
        if(r==null&&q==null){
            return true;
        }
        if(r==null||q==null){
            return false;
        }
    
        return r.val == q.val && isSymmetricbyPart(r.left,q.right) && isSymmetricbyPart(r.right,q.left);
    }
}