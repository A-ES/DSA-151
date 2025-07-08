package Arrays.day4;

public class max_chunks2 {public int maxChunksToSorted(int[] arr) {

    // generate r min
    int[] Rmin=new int[arr.length+1];
    Rmin[arr.length]= Integer.MAX_VALUE;

    for(int i = arr.length-1;i>=0;i--){
        Rmin[i]=Math.min(Rmin[i+1],arr[i]);
    }
   // iterating array and manaling Lmax also count
   int lmax = Integer.MIN_VALUE;
   int count=0;
   for(int i=0;i<arr.length;i++){
    lmax=Math.max(arr[i],lmax);
        if(lmax<=Rmin[i+1])
            count++;
            
   }

    
return count; }
    
}
