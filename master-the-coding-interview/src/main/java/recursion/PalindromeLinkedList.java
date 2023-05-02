package recursion;

public class PalindromeLinkedList {

    int numF = 0;
    int numB = 0;

    public static void main(String[] args) {
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        PalindromeLinkedList o = new PalindromeLinkedList();
        boolean palindrome = o.isPalindrome(l2);
    }

    public boolean isPalindrome(ListNode head) {
        int f = combineForward(head);
        int b = combineBackward(head);
        /*  combineBackward(head);*/
        System.out.println(f);
        System.out.println(b);
        return f == b;
    }

    public int combineForward(ListNode l) {
        if (l.next == null) return l.val;
        return l.val + 10 * combineForward(l.next);
    }

    public int combineBackward(ListNode l) {
        if (l.next == null) return l.val * 10;
        return l.val + combineForward(l.next);
    }
//    public void combineForward(ListNode head) {
//        if(head == null) return;
//        numF= numF * 10 + head.val;
//        combineForward(head.next);
//    }

//    public void combineBackward(ListNode head) {
//        if(head == null) return;
//        combineBackward(head.next);
//        numB = numB * 10 + head.val;
//    }
}
