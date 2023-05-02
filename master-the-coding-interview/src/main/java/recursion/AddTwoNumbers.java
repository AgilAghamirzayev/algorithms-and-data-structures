package recursion;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5, new ListNode(6));
        ListNode l2 = new ListNode(5, new ListNode(4, new ListNode(9)));

        AddTwoNumbers a = new AddTwoNumbers();
        a.addTwoNumbers(l1, l2);

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;

        ListNode resNode = new ListNode();
        ListNode copNode = resNode;

        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode();
            newNode.val = sum % 10;
            copNode.next = newNode;
            copNode = newNode;

            sum /= 10;
        }

        return resNode.next;
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