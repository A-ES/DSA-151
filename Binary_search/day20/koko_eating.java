package Binary_search.day20;

import java.util.Arrays;

public class koko_eating {
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // minimum speed can't be 0
        int high = Arrays.stream(piles).max().getAsInt(); // max speed is max pile
        int ans = high; // initialize with max possible

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                ans = mid;       // try to minimize speed
                high = mid - 1;
            } else {
                low = mid + 1;   // increase speed
            }
        }
        return ans;
        
    }
    public boolean canFinish(int[] piles, int h, int k){
    long hours = 0;
    for (int pile : piles) {
        hours += (pile + (long)k - 1) / k;  // cast one part to long to avoid overflow
    }
    return hours <= h;
}

}
    
}
