package Two_pointers.day7;

public class container_most_water {
    class Solution {
        public int maxArea(int[] arr) {
            int n = arr.length;
            int l=0;
            int r=n-1;
            int area;
            int res=0;
            while(l<r){
               int lh = arr[l];
                int rh = arr[r];
    
                area = Math.min(lh,rh) * (r-l);
                res = Math.max(res,area);
                if(lh<rh){
                    l++;
                }
                else{
                    r--;
                }
            }
            
       return res; }
    }
    
}
