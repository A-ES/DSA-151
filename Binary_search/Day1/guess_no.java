package Binary_search.Day1;

public class guess_no {
    /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution  {
    public int guessNumber(int n) {
        int low =0;
        int high = n;
        int mid =0;
       
        while(low<high){
            mid= low+(high-low)/2;
            int pik = (mid); //guess(mid
            if(pik==-1)
            {
                high=mid;
            }
            else if (pik==1)
            {
                low=mid+1;
            }
            else 
            return mid;
        }
        
    return low; }
}
}
