package easy;

public class _167_AddTwoNumbers {
    /**
     * l1和l2是表示两个数组的链表
     * 例如：1->2->3->null 表示321;4->5->6->null 表示654
     * l1+l2 即321+654 = 975 表示为5->7->9->null
     */
    /*
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry =0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry+=l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry+=l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(carry % 10);
            carry = carry / 10;
            temp = temp.next;
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return result.next;
    }
}
