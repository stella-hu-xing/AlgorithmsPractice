package easy_level;

/**
 * 哈哈，不难不简单
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 * 
 * 
 * @author xinghu
 *
 *
 */
public class MaximumDepthofBinaryTree_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// stil using TreeNode class
	// genius method by myself!!!!  0ms, beats 91.53%
	public int maxDepth(TreeNode root) {
	

		if (root == null) {
			return 0;
		}
		int max = Math.max(maxDepth(root.left), maxDepth(root.right))+1;

		return max;

	}

}
