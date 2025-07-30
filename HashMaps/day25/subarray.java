package HashMaps.day25;

import java.util.HashMap;

public class subarray {
    class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        for(int num: nums){
            sum+=num;
            if(sum==k) result++;
            result+= map.getOrDefault(sum-k,0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return result;

    }
}
    
}
