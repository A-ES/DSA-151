public class kadanes {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element to handle cases where all elements are negative
        int max = nums[0];
        int sum = 0;
       

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    

}
