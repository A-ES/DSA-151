public class squares_sorted_array {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for( int i=0; i<nums.length;i++)
        {
            nums[i]= nums[i]*nums[i];
        }
        int head=0;
        int tail=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
        if(nums[tail]>nums[head])
        {
            result[i]=nums[tail];
            tail--;
        }
        else
        {
            result[i]=nums[head];
            head++;
        }
        }
        return result;
       
    }
}
