class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean zigzag = false;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                
                if (zigzag) {
                    levelList.add(0, node.val); // Add node value at the beginning for zigzag pattern
                } else {
                    levelList.add(node.val); // Add node value at the end for normal pattern
                }
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            result.add(levelList);
            zigzag = !zigzag; // Toggle the zigzag flag
        }
        
        return result;
    }
}
