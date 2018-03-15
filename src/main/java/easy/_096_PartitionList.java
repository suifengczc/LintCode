package easy;

import common.ListNode;

public class _096_PartitionList {
    /*
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public static ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode temp = null;
        ListNode small = new ListNode(0);
        ListNode smallTemp = small;
        ListNode big = new ListNode(0);
        ListNode bigTemp = big;
        while (head != null) {
            if (head.val >= x) {
                bigTemp.next = head;
                // TODO 这里的bigTemp 和 big是什么关系？
                bigTemp = bigTemp.next;
            } else {
                smallTemp.next = head;
                smallTemp = smallTemp.next;
            }
            head = head.next;
        }
        bigTemp.next = null;
        smallTemp.next = big.next;
        return small.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode node1 = new ListNode(-5);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-8);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(8);
        ListNode node6 = new ListNode(-8);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        partition(head, -4);
    }
}
