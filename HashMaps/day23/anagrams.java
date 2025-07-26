package HashMaps.day23;

import java.util.HashMap;

public class anagrams {
    class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        if(a1.length!=a2.length) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: a1){
            map.put(c, map.getOrDefault(c,0)+1);
        }
         for(char c: a2){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c)-1);
            if(map.get(c)<0) return false;
        }
       
    return true;}
}
    
}
