package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _066_BinaryTreePreorderTraversal {
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
    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /*
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     * 递归前序遍历解法
     */
    public static List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        trailing(result,root);
        return result;
    }

    public static void trailing(List<Integer> result, TreeNode node) {
        if (node != null) {
            result.add(node.val);
            trailing(result,node.left);
            trailing(result,node.right);
        }
    }

    /*
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     * 非递归前序遍历解法
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                result.add(node.val);
                node = node.left;
            }
            if (!stack.empty()) {
                node = stack.pop();
                node = node.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(preorder(root));
    }
}
