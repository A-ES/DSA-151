package heaps.day15;

import java.util.PriorityQueue;

public class kth_largest {
    
    class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num :nums){
            minHeap.add(num);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        
     return minHeap.peek();
    }
   
}
}
