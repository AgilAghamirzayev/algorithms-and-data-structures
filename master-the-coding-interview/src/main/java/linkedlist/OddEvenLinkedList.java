package linkedlist;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode test = new ListNode(1, new ListNode());
        test.next = new ListNode(2, new ListNode());
        test.next.next = new ListNode(3, new ListNode());
        test.next.next.next = new ListNode(4, new ListNode());
        test.next.next.next.next = new ListNode(5, new ListNode());
        test.next.next.next.next.next = new ListNode(6, null);

        System.out.println(oddEvenList(test));

    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode first = head;
//
//        while (first != null && first.next != null) {
//            result = new ListNode(first.val, new ListNode());
//            first = first.next.next;
//            result.next = result;
//        }
//
//        return result;
        return null;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

