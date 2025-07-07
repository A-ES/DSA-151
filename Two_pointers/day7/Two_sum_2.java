package Two_pointers.day7;

import java.util.Arrays;

public class Two_sum_2 {
    class Solution {

    public class Pair implements Comparable<Pair>{
            int val;
            int idx;
            Pair(int val, int idx){
                this.val=val;
                this.idx=idx;
            }
            public int compareTo(Pair o){
                return this.val-o.val;
            }
        }

    public int[] twoSum(int[] nums, int target) {
        Pair[] pairs = new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            pairs[i]=new Pair(nums[i],i);
        }
        Arrays.sort(pairs);

        int[] res = new int[2];
        int li =0;
        int ri=pairs.length-1;
        while(li<ri){
            int right = pairs[ri].val;
            int left = pairs[li].val;
            if(right+left<target){
                li++;
            }
            else if (right+left>target){
                ri--;
            }
            else{
                res[0]=pairs[li].idx;
                res[1]=pairs[ri].idx;
                break;
            }
        }

    return res;
    }
}
    
}
