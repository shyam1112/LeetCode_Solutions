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
        List<Integer> list= new ArrayList<Integer>();
        return inorder(root,list);
    }

    public static List<Integer> inorder(TreeNode node,List<Integer> list){
        if(node == null){
            return list;
        }        
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);

        return list;
    }
}
