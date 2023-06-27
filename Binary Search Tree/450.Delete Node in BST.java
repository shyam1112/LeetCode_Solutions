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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val == key){
            return helper(root);
        }
        TreeNode node=root;
        while(root!=null){
        
            if(root.val<key){
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }else{
                root=root.right;

                }
            }else{
                 if(root.left !=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }   
        }
        
        return node;
        }
        public static TreeNode helper(TreeNode root){
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }
            TreeNode rightchild=root.right;
            TreeNode lastright=findlastright(root.left);
            lastright.right=rightchild;
            return root.left;
        }
        public static TreeNode findlastright(TreeNode root){
            if(root.right==null){
                return root;
            }
            return findlastright(root.right);
        
        }
    }
