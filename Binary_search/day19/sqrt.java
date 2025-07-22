package Binary_search.day19;

public class sqrt {
    class Solution {
        public int mySqrt(int x) {
            int low =1;
            int high =x;
            int ans = 0;
            if (x==0) return 0;
            while(low<=high){
                int mid = low+(high-low)/2;
                long sq =(long)mid*mid;
                if(sq==x){
                    return mid;
                }
                if(sq<x){
                    ans = mid;
                    low = mid + 1;
                }
                else
                    high = mid -1;
            }
            return ans;
        }
    }
    
}
