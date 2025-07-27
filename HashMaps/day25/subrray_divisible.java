package HashMaps.day25;

import java.util.HashMap;

public class subrray_divisible {

    class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int remainder = 0;
        int result = 0;
        for(int num: nums){
            sum+= num;
            remainder = ((sum%k)+k)%k;
            result = result + map.getOrDefault(remainder,0);
            map.put(remainder, map.getOrDefault(remainder,0)+1);
        }
        return result;
        
    }
}
    
}
