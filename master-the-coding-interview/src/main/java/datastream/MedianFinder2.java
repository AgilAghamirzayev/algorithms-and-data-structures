package datastream;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder2 {

    private Queue<Integer> minHeap, maxHeap;

    MedianFinder2() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (minHeap.size() == maxHeap.size()) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        return minHeap.size() > maxHeap.size() ?
                minHeap.peek() : (minHeap.peek() + maxHeap.peek()) / 2.0;

    }
}