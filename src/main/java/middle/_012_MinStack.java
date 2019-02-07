package middle;

import java.util.Stack;

/**
 * 12. 带最小值操作的栈
 * 实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。
 * <p>
 * 你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。
 * <p>
 * 样例
 * 如下操作：push(1)，pop()，push(2)，push(3)，min()， push(1)，min() 返回 1，2，1
 * <p>
 * 注意事项
 * 如果堆栈中没有数字则不能进行min方法的调用
 */

public class _012_MinStack {
    /**
     * 带最小值操作的栈
     * 思路:需要保存每个入栈后的栈内最小值，出栈后更新最小值
     */
    public static class MinStack {
        private Stack<Integer> minStack;
        private Stack<Integer> stack;

        public MinStack() {
            // do intialization if necessary
            minStack = new Stack<>();
            stack = new Stack<>();
        }

        /*
         * @param number: An integer
         * @return: nothing
         */
        public void push(int number) {
            // write your code here
            minStack.push(number);
            if (stack.empty()) {
                stack.push(number);
            } else {
                stack.push(number <= stack.peek() ? number : stack.peek());
            }
        }

        /*
         * @return: An integer
         */
        public int pop() {
            // write your code here
            if (stack.size() > 0) {
                stack.pop();
            }
            return minStack.pop();
        }

        /*
         * @return: An integer
         */
        public int min() {
            // write your code here
            return stack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(1);
        System.out.println(m.min());
        m.push(2);
        System.out.println(m.min());
        m.push(3);
        System.out.println(m.min());
        System.out.println(m.pop());
//        m.min();
//        m.pop();
    }
}
