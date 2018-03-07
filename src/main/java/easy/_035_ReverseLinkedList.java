package easy;

public class _035_ReverseLinkedList {
    //此路不通
//    public ListNode reverse(ListNode head) {
//        // write your code here
//        ListNode result = null;
//        List<Integer> values = new ArrayList<>();
//        ListNode item = head;
//        while (item.next != null) {
//            values.add(item.val);
//            item = item.next;
//        }
//        ListNode temp = null;
//        for (int i = 0; i < values.size(); i++) {
//            temp = new ListNode(values.get(i));
//            result.next = temp;
//        }
//        return null;
//    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newList = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newList;
            newList = head;
            head = temp;
        }
        return newList;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        reverseList(head);
    }
}
