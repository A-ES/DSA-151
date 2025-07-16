package Bit_manipulation.day13;

public class divisor {
    class Solution {
        public int divide(int dividend, int divisor) {
            if (dividend == divisor) {
                return 1;
            }
    
            boolean sign = true;
            if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))
                sign = false;
            long n= Math.abs((long) dividend);
            long d = Math.abs((long) divisor);
    
            long q=0;
             
             while(n>=d){
                long cnt = 0;
                while(n>=(d<<cnt+1)){
                    cnt++;
                }
                q=q+(1L<<cnt);
                n=n-(d<<cnt);
             }
    
              // To represent 2^31 as a long in Java, it's 1L << 31.
            if (q == (1L << 31) && sign) {
                return Integer.MAX_VALUE; // If 2^31 and positive, it's an overflow beyond INT_MAX, so return INT_MAX
            } 
            if (q >= (1L << 31) && !sign){
                return Integer.MIN_VALUE; // If 2^31 and negative, it's exactly INT_MIN
            }
            
         return sign ? (int)q : (int)-q;
         }
    }
    
}
