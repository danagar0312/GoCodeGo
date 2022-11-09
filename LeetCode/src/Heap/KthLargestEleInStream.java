package Heap;

import java.util.PriorityQueue;

public class KthLargestEleInStream {

    // define priority queue to store K elements only in it

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        KthLargestEleInStream obj = new KthLargestEleInStream();

        int[] arr = new int[]{10, 17, 112, 5, 27, 8, 9, 45};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(obj.add(arr[i], k));
        }

    }

    public int add(int num, int k) {
        if (minHeap.size() < k) {
            minHeap.add(num);
            return minHeap.size() == k ? minHeap.peek() : -1;
        }

        if (num > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(num);
        }

        return minHeap.peek();
    }
}
