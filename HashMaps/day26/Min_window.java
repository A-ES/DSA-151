package HashMaps.day26;

public class Min_window {
    class Solution {
        public String minWindow(String s, String t) {
    if (s == null || t == null || s.length() < t.length()) return "";
        int[] hash = new int[128];
        for(char c : t.toCharArray()){
            hash[c]++;
        }
        int left=0,right=0;
        int minLen = Integer.MAX_VALUE;
            int startIndex = 0;
            int count = 0; 
            while(right< s.length()){
                char rchar = s.charAt(right);
                hash[rchar]--;
                if(hash[rchar]>=0){
                    count++;
                }
                while(count==t.length()){
                    if(right-left+1<minLen){
                        minLen = right-left+1;
                        startIndex= left;
                    }
                    char lchar = s.charAt(left);
                    hash[lchar]++;
                    if(hash[lchar]>0){
                        count--;
                    }
                    left++;
                }
                right++;
            }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
        }
    }
    
}
