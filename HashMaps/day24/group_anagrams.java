package HashMaps.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams {
    class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String str : strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);

            if(map.containsKey(sorted)){
                ans.get(map.get(sorted)).add(str);

            }
            else{
                map.put(sorted, ans.size());
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                ans.add(newGroup);
        

            }

        }

        
    return ans;}
}
    
}
