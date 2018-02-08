package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _067_BinaryTreeInorderTraversal {
    /**
     * Definition of TreeNode:
     * public class TreeNode {
     * public int val;
     * public TreeNode left, right;
     * public TreeNode(int val) {
     * this.val = val;
     * this.left = this.right = null;
     * }
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

    /*
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     * 飞递归中序遍历解法
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty())
    }
}
