package Recurstion_backtrack.day10;

import java.util.ArrayList;
import java.util.List;

public class Phone_combinations {
    class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        
        solve(0, digits, new StringBuilder(),ans,mapping );
        return ans;
    }

        public void solve( int idx, String digits, StringBuilder current, List<String> ans, String[] mapping){
            if(idx==digits.length()){
                ans.add(current.toString());
                return;
            }
            String letters = mapping[digits.charAt(idx)-'0'];
            for (int i =0; i<letters.length();i++){
                current.append(letters.charAt(i));
                solve(idx+1, digits, current, ans, mapping);
                current.deleteCharAt(current.length()-1);
        
            }



        }
    }

}
