package easy;

import common.TreeNode;

public class _097_MaximumDepthOfBinaryTree {
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
