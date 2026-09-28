class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(int l=0,r=0;r<s.length();r++){
            if(mp.containsKey(s.charAt(r))){
                l=Math.max(l,mp.get(s.charAt(r))+1);
            }
            mp.put(s.charAt(r),r);
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
        
    }
}