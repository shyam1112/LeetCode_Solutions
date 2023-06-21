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
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
        Tree(root);
        return ans;
    }
    public int Tree(TreeNode node){
        if(node == null){
            return 0;
        }

        int l=Tree(node.left);
        int r=Tree(node.right);
        ans=Math.max(ans,l+r);

        return Math.max(l,r)+1;
    }

}
