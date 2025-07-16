package Bit_manipulation.day13;

public class single_no_3 {
    class Solution {
        public int[] singleNumber(int[] nums) {
            int result =0;
            for(int i = 0; i< nums.length; i++){
                result= result^nums[i];
            }
            int xor = (result&result-1)^result;
            int b1=0;
            int b2=0;
            for(int i=0;i<nums.length;i++){
                if((xor & nums[i])!=0){
                    b1=b1^nums[i];
                }
                else{
                    b2=b2^nums[i];
                }
            }
               return new int[]{b1, b2};
        }
    }
    
}
