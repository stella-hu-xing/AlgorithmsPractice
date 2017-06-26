package easy_level;

/*
 * 第二种方法有点意思
 * Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
public class InvertBinaryTree_226 {

	// stil use TreeNode class

	public static void main(String[] args) {

	}

	// 0ms, beats 28%
	public TreeNode invertTree(TreeNode root) {

		if (root == null || (root.left == null && root.right == null)) {
			return root;
		}

		if (root.left != null) {
			TreeNode t = root.left;
			root.left = root.right == null ? null : root.right;
			root.right = t;
		} else if (root.right != null && root.left == null) {
			TreeNode t = root.right;
			root.right = null;
			root.left = t;
		}

		invertTree(root.left);
		invertTree(root.right);
		return root;

	}
	
	// another method
	public TreeNode invertTree2(TreeNode root) {

		if (root == null || (root.left == null && root.right == null)) {
			return root;
		}

		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
	
		root.left=right;
		root.right=left;

		
		return root;

	}

}
