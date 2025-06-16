package Arrays.day3;

public class max_chunks {
    class Solution {
        public int maxChunksToSorted(int[] arr) {
            int max=0;
            int chunks=0;
            for(int i=0;i<=arr.length-1;i++)
            {
               if(arr[i]>max)
               {
                max = arr[i];
                System.out.print(max);
               }
               if(i==max){
                chunks++;
                System.out.print("chunks added");
                
               }
            }
            return chunks;
        }
    }
    
}
