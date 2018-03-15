package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _066_BinaryTreePreorderTraversal {
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
                stack.push(node);//从根节点开始将所有的左节点按顺序压入栈顶，直到当前路径先的叶子节点跳出循环
                result.add(node.val);//记录栈顶的node，前序遍历从根节点开始
                node = node.left;
            }
            if (!stack.empty()) {//当栈非空时，从栈顶取出节点获取其右节点，再以该节点为根节点依次获取其子树的左节点，直至所有节点出栈
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
