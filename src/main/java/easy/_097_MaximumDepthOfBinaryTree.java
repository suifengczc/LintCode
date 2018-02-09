package easy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class _097_MaximumDepthOfBinaryTree {
    /**
     * Definition of TreeNode:
     * public class TreeNode {
     *     public int val;
     *     public TreeNode left, right;
     *     public TreeNode(int val) {
     *         this.val = val;
     *         this.left = this.right = null;
     *     }
     * }
     */

    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root != null) {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return (l < r) ? r + 1 : l + 1;
        }else{
            return 0;
        }
    }
}
