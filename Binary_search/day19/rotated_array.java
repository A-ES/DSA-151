package Binary_search.day19;

public class rotated_array {
    class Solution {
        public int search(int[] arr, int target) {
            int low =0;
            int high = arr.length-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if (arr[mid]==target) return mid;
                if(arr[low]<=arr[mid]){
                    if(arr[low]<= target && target<=arr[mid]){
                        high= mid-1;
                    }
                    else low = mid+1;
    
                }
                else{
                    if(arr[high]>=target&& arr[mid]<= target){
                        low = mid+1;
                    }
                    else high = mid-1;
    
                }
            }
            
        return -1;}
    }
    
}
