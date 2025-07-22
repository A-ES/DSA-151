package Binary_search.Day1;

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int mid;
         for(int w : weights){
            low=Math.max(low,w);
            high+=w;
         }

         while(low<high){
          mid = low + (high - low) / 2;

            if(shipCan(weights, mid, days)){
                high=mid;
            }
            else{
                low=mid+1;
            }
         }
         return low;
    }
    public boolean shipCan(int[] weights, int capacity, int days){
        int load =0;
        int day = 1;

        for(int w: weights){
            if(load+w > capacity){
                day++;
                load=0;
            }
            load+= w;
            if(day>days){
                return false;
            }
           
        }
         return true;
    }
}