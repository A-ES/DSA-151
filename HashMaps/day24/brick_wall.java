package HashMaps.day24;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class brick_wall {
    class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> countGap = new HashMap<>();

        for(List<Integer> row : wall){
            int total = 0;

            for(int i=0; i<row.size()-1;i++){
                total+= row.get(i);
                countGap.put(total, countGap.getOrDefault(total,0)+1);
            }
            
        }
        int max=0;
        for(int count: countGap.values()){
                max = Math.max(max,count);
            }
    return wall.size()-max;
    }
}
    
}
