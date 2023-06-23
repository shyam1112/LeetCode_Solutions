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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new LinkedList<Integer>();
        rightView(root,list,0);
        return list;
    }
    public static void rightView(TreeNode node,List<Integer> list,int level){
        if(node == null){
            return;
        }
        if(list.size()==level){
            list.add(node.val);
        }
        rightView(node.right,list,level+1);
        rightView(node.left,list,level+1);

    }
}
