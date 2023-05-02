package stack.and.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}


class MyQueue {

    Queue<Integer> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.poll();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}