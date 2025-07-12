package Bit_manipulation.day12;

public class single_ele_2 {
    class Solution {
        public int singleNumber(int[] nums) {
            int ones = 0, twos = 0;
    
    for (int num : nums) {
        ones = (ones ^ num) & ~twos;
        twos = (twos ^ num) & ~ones;
    }
    return ones;
    
        }
    }
    
}
