package demo;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
	/**
	 * Given a binary tree, find its maximum depth.
	 * 
	 * The maximum depth is the number of nodes along the longest path from the
	 * root node down to the farthest leaf node.
	 * 
	 * Subscribe to see which companies asked this question
	 */

	public int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}else{
			return 1+Math.max(maxDepth(root.left),maxDepth(root.right ));
		}
	}
	
    
    /**invert a binary tree*/
    public TreeNode invertTree(TreeNode root) {
        return null;
    }
}


