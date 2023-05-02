package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(10);
        list.insertLast(11);
        list.display();
        list.insert(100, 3);


        list.display();
    }
}
