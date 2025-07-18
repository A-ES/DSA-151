package Recurstion_backtrack.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_2 {
    class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        

        for(int i=ind; i<arr.length;i++){
            if(i<ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            findCombination(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        
        }
    }
    
}
}
