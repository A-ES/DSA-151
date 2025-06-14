package Arrays.day2;

public class majority_element {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ele = nums[0];
        for(int i =1;i<=nums.length-1;i++)
        {
            if(ele==nums[i]){
                count++;
            }
            else if(count==0)
            {
                count=1;
                ele=nums[i];
            }
            else{
                count--;
            }
        }
    return ele;
    }
}


