package Bit_manipulation.day12;

public class single_ele_1_2nd {
    class Solution {
        public int singleNumber(int[] nums) {
            int result=0;
            for(int num :nums){
                result=result^num;
            }
            return result;
        }
    }
    
}
