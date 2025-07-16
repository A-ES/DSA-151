package Bit_manipulation.day14;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int total= 1 <<n;
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<total;i++){
            List<Integer> subset = new ArrayList<>();
            for(int j=0; j<n; j++){
                if( (i & (1<<j)) !=0){
                    subset.add(nums[j]);
                }
            }
            result.add(subset);

        }
        return result;
    }
}
    
}
