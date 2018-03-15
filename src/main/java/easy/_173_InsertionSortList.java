package easy;

import common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _173_InsertionSortList {
    /*
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        List<Integer> val = new ArrayList<>();
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (head != null) {
            val.add(head.val);
            head = head.next;
        }
        val.sort(Comparator.comparing(Integer::intValue));
        for (int i = 0; i < val.size(); i++) {
            temp.next = new ListNode(val.get(i));
            temp = temp.next;
        }
        return result.next;
    }

    /*
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList_1(ListNode head) {
        ListNode dummy = new ListNode(0);
        // 这个dummy的作用是，把head开头的链表一个个的插入到dummy开头的链表里
        // 所以这里不需要dummy.next = head;

        while (head != null) {
            ListNode node = dummy;
            while (node.next != null && node.next.val < head.val) {
                node = node.next;
            }
            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }
        return dummy.next;
    }
}
