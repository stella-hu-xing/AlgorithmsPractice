package easy_level;

/**
 * 有点难呀 You need to construct a string consists of parenthesis and integers from
 * a binary tree with the preorder traversing way.
 * 
 * The null node needs to be represented by empty parenthesis pair "()". And you
 * need to omit all the empty parenthesis pairs that don't affect the one-to-one
 * mapping relationship between the string and the original binary tree.
 * 
 * Example 1: Input: Binary tree: [1,2,3,4]
 *       1
     /   \
    2     3
   /    
  4   
 * 
 * Output: "1(2(4))(3)"
 * 
 * Explanation: Originallay it needs to be "1(2(4)())(3()())", but you need to
 * omit all the unnecessary empty parenthesis pairs. And it will be
 * "1(2(4))(3)". 
 * 
 * Example 2: Input: Binary tree: [1,2,3,null,4]
 *      1
     /   \
    2     3
     \  
      4 
 * 
 * Output: "1(2()(4))(3)"
 * 
 * Explanation: Almost the same as the first example, except we can't omit the
 * first parenthesis pair to break the one-to-one mapping relationship between
 * the input and t
 * 
 * @author xinghu
 * 
 *         still using helper class TreeNode
 *
 */
public class ConstructStringfromBinaryTree_606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// time limit exceeded
	public String tree2str(TreeNode t) {
		String s = "";
		if (t == null) {
			return "";
		}
		String root = String.valueOf(t.val) + "";
		String sl = tree2str(t.left);
		String rl = tree2str(t.right);
		System.out.println(sl);
		System.out.println(rl);
		if (sl == "" && rl == "") {
			s += root;
		} else if (sl == "") {
			String temp = root + "()" + "(" + rl + ")";
			s += temp;
		} else if (rl == "") {
			String temp = root + "(" + sl + ")";
			s += temp;
		} else {
			s += (root + "(" + sl + ")" + "(" + rl + ")");
		}

		return s;

	}
	//why exceed time limit? because keeping std out statement
	public String tree2str2(TreeNode t) {

		if (t == null) {
			return "";
		}
		String root = String.valueOf(t.val) + "";
		String sl = tree2str(t.left);
		String rl = tree2str(t.right);
		System.out.println(sl);
		System.out.println(rl);
		if (sl == "" && rl == "") {
			return root;
		} else if (sl == "") {
			return root + "()" + "(" + rl + ")";

		} else if (rl == "") {
			return root + "(" + sl + ")";

		} else {
			return (root + "(" + sl + ")" + "(" + rl + ")");
		}

	}
}
