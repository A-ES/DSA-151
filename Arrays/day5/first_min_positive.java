package Arrays.day5;

public class first_min_positive {
    class Solution {
        public int firstMissingPositive(int[] arr) {
            int n = arr.length;
            for(int i =0; i<n;i++){
                if(arr[i]<=0){
                    arr[i]=n+1;
                }
            }
    
            for(int i=0; i<n;i++){
                int index = Math.abs(arr[i]) - 1;
                if(index<n){
                    arr[index] = -Math.abs(arr[index]);
    
                }
            }
            for(int i=0; i<n;i++){
                if(arr[i]>0)
                {
                    return i+1;
                }
    
            } 
            return n+1;
    
            }
            
        }
    
    
}
