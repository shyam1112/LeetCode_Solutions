/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void markParent(TreeNode root,Map<TreeNode,TreeNode> parent){
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.left!= null){
                parent.put(node.left,node);
                queue.offer(node.left);
            }
            if(node.right!= null){
                parent.put(node.right,node);
                queue.offer(node.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent= new HashMap<>();
        markParent(root, parent);

        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        Set<TreeNode> visited= new HashSet<>();
        queue.offer(target);
        visited.add(target);
        int level=0;
        List<Integer> list= new ArrayList<Integer>();
       while (!queue.isEmpty()) {
            int size = queue.size();
            if (level == k) {
                break;
            }
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null && !visited.contains(node.left)) {
                    queue.offer(node.left);
                    visited.add(node.left);
                }
                if (node.right != null && !visited.contains(node.right)) {
                    queue.offer(node.right);
                    visited.add(node.right);
                }
                TreeNode parentNode = parent.get(node);
                if (parentNode != null && !visited.contains(parentNode)) {
                    queue.offer(parentNode);
                    visited.add(parentNode);
                }
            }
        }
        
        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            list.add(node.val);
        }
        return list;
    }
}
