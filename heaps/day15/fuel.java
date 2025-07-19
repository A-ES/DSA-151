package heaps.day15;

import java.util.PriorityQueue;

public class fuel {
    class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int fuel = startFuel;
        int result=0;
        int refuels=0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        int i =0;
        while(fuel<target){
            while(i<stations.length && stations[i][0]<=fuel){
                maxHeap.add(stations[i][1]);
                i++;
            }
            if(maxHeap.isEmpty()){
                return -1;
            }

            fuel+= maxHeap.poll();
            refuels++;

        }
        return refuels;
        
    }
}
    
}
