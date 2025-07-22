package Binary_search.Day1;

public class Binary_search {
    class Solution {
        public int search(int[] nums, int target) {
            int low =0;
            int high= nums.length;
            while(low<high){
                int mid = low + (high-low)/2;
                if(target<nums[mid]){
                    high=mid;
                }
                else if(target>nums[mid]){
                    low = mid +1;
                }
                else if (target==nums[mid]){
                    return mid;
                }
                
            }
        
        return -1;
        }
    }
}
