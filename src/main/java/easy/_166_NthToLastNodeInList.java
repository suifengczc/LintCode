package easy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.List;

public class _166_NthToLastNodeInList {
    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list.
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head == null) {
            return null;
        }
        //通过temp链表来控制进度，先将temp链表前进n的长度，再让result和temp同时前进，当temp结束时，result刚好停在倒数n的位置
        ListNode result = head;
        ListNode temp = head;
        for (int i = 0; i < n - 1; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }
        while (temp.next != null) {
            result = result.next;
            temp = temp.next;
        }
        return result;
    }
}
