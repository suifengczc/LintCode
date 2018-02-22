package easy;

public class _112_RemoveDuplicatesFromSortedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (temp.next != null) {
            int value = temp.val;
            if (temp.next.val == value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
