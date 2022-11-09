package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargeValuesArray {

    public static List<Integer> getLargeKElementsFromArray(int[] num, int k) {
        // declare minheap first
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            minHeap.add(num[i]);
        }

        for (int i = k; i < num.length; i++) {
            if (num[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num[i]);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(minHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {100, 72, 121, 300, 81, 38, 12, 145};
        int k = 3;

        System.out.println(TopKLargeValuesArray.getLargeKElementsFromArray(arr, k));

    }
}
