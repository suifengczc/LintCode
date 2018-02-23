package easy;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _173_InsertionSortList {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
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
}
