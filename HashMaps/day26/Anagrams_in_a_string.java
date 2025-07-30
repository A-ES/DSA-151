package HashMaps.day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams_in_a_string {
    class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> pCount = new HashMap<>();

        if(s.length()<p.length()) return ans;

        for(int i =0 ; i < p.length(); i ++){
            char sChar= s.charAt(i);
            char pChar = p.charAt(i);

            sCount.put(sChar, sCount.getOrDefault(sChar,0)+1);
            pCount.put(pChar, pCount.getOrDefault(pChar,0)+1);
        }
        int l =0;

        if(pCount.equals(sCount)) ans.add(0);
        for(int i= p.length();i<s.length();i++){
                char r = s.charAt(i);
                sCount.put(r, sCount.getOrDefault(r,0)+1);
                
                char lChar = s.charAt(l);
                sCount.put(lChar, sCount.get(lChar)-1);

                if(sCount.get(lChar)==0){
                    sCount.remove(lChar);
                }
                l++;
                if(pCount.equals(sCount)) ans.add(l);

        }
        
    return ans;
    }
}
    
}
