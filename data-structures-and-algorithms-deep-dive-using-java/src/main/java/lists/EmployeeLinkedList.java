package lists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.next = head;
        head = node;
        size++;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.println(" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;
        EmployeeNode removedNode = head;
        head = head.next;
        size--;
        removedNode.next = null;
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
