package middle;

import java.util.Stack;

public class _012_MinStack {
    /**
     * 带最小值操作的栈
     */
    public static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public MinStack() {
            // do intialization if necessary
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        /*
         * @param number: An integer
         * @return: nothing
         */
        public void push(int number) {
            // write your code here
            stack.push(number);
            if (minStack.empty()) {
                minStack.push(number);
            } else {
                if (number <= minStack.peek()) {
                    minStack.push(number);
                }
            }
        }

        /*
         * @return: An integer
         */
        public int pop() {
            // write your code here
            if (!minStack.empty() && stack.peek() == minStack.peek()) {
                minStack.pop();
            }
            return stack.pop();
        }

        /*
         * @return: An integer
         */
        public int min() {
            // write your code here
            return minStack.pop();
        }
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(1);
        m.push(2);
        m.push(3);
        System.out.println(m.min());
        System.out.println(m.pop());
        // TODO min only can use once, not good
//        m.min();
//        m.pop();
    }
}
