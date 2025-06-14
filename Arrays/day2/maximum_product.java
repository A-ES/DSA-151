package Arrays.day2;

public class maximum_product {
    public int maxProduct(int[] nums) {
        int minP = nums[0];
        int maxP = nums[0];
        int current;
        int finall=nums[0];

        for(int i=1; i<nums.length;i++)
        {
            current = nums[i];
            int tempMinP=Math.min(current, Math.min(minP*current,maxP*current));
            maxP = Math.max(current, Math.max(minP * current, maxP * current));
            minP=tempMinP;
            finall=Math.max(finall,maxP);
        }
        return finall;
    }
    
}
