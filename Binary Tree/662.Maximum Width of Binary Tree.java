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
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair> q= new LinkedList<>();
        q.offer(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().num;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.peek().node;
                int id=q.peek().num-min;
                q.poll();
                if(i==0){
                    first=id;
                }
                if(i==size-1){
                    last=id;
                }
                if(node.left!=null){
                    q.offer(new Pair(node.left,id*2+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,id*2+2));
                }
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;      
    }
}
