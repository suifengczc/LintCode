package easy;

import com.sun.prism.shader.Solid_TextureSecondPassLCD_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _067_BinaryTreeInorderTraversal {
    /*
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     * 递归中序遍历解法
     */
    public static List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode node = root;
        trailing(result, node);
        return result;
    }

    public static void trailing(List<Integer> result, TreeNode node) {
        if (node != null) {
            trailing(result, node.left);
            result.add(node.val);
            trailing(result, node.right);
        }
    }

    /*
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     * 非递归中序遍历解法
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.empty() || node != null) {
            while (node != null) {
                stack.push(node);//从根节点开始将所有的左节点按顺序压入栈顶，直到当前路径下的叶子节点跳出循环，叶子节点为栈顶
                node = node.left;
            }
            if (!stack.empty()) {//当栈非空时，从栈顶取出节点保存其值并获取其右节点，再以该节点为根节点依次获取其子树的左节点，直至所有节点出栈
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node6.left = node7;
        System.out.println(inorder(root));
    }
}
