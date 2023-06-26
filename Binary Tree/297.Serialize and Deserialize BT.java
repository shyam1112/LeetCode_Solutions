/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer(root);
        StringBuilder str= new StringBuilder();
        while(!q.isEmpty()){
            TreeNode node= q.poll();
            if(node == null){
                str.append("null ");
                continue;
            }
            str.append(node.val+" ");
            q.offer(node.left);
            q.offer(node.right);
            
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if (data.equals("") || data.isEmpty()) {
        return null;
    }
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        String[] str= data.split(" ");

        TreeNode root= new TreeNode(Integer.parseInt(str[0]));
        q.offer(root);
        for(int i=1;i<str.length;i++){
            TreeNode node= q.poll();
            if(!str[i].equals("null")){
                TreeNode temp= new TreeNode(Integer.parseInt(str[i]));
                node.left=temp;
                q.offer(temp);
            }
            if(!str[++i].equals("null")){
                TreeNode temp= new TreeNode(Integer.parseInt(str[i]));
                node.right=temp;
                q.offer(temp);
            }

        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
