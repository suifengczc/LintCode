package easy;

public class _174_RemoveNthNodeFromEndOfList {
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
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp = result;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        while (head != null) {
            temp = temp.next;
            head = head.next;
        }
        temp.next = temp.next.next;
        return result.next;
    }
}
