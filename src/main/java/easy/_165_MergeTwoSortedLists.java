package easy;

import jdk.nashorn.internal.ir.WhileNode;
import sun.plugin2.util.NativeLibLoader;

public class _165_MergeTwoSortedLists {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /*
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode a = l1;
        ListNode b = l2;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (a != null && b != null) {
            if (a.val < b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = a == null ? b : a;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode _1 = new ListNode(1);
        ListNode _3 = new ListNode(3);
        ListNode _5 = new ListNode(5);
        ListNode _2 = new ListNode(2);
        _1.next = _3;
        _3.next = _5;
        mergeTwoLists(_1, _2);
    }
}
