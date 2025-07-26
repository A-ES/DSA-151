package HashMaps.day23;

import java.util.HashMap;

public class first_uniq_char {
    class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char st[] = s.toCharArray();
        for(char c : st){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i =0; i<st.length;i++){
            if(map.get(st[i])==1){
                return i;
            }
        }
    return -1;}
}
}
