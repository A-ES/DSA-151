package Recurstion_backtrack.day8;

import java.util.*;

public class Permutation_seq {

class Solution {
    private int count = 0; // to track current permutation index
    private String result = "";

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        boolean[] freq = new boolean[n];
        backtrack(nums, new ArrayList<>(), freq, k);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> ds, boolean[] freq, int k) {
        if (result.length() > 0) return; // early stop if result is found

        if (ds.size() == nums.length) {
            count++;
            if (count == k) {
                StringBuilder sb = new StringBuilder();
                for (int num : ds) sb.append(num);
                result = sb.toString();
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                backtrack(nums, ds, freq, k);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}

}
