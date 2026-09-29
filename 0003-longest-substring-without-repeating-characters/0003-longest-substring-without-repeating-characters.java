class Solution {
    public int lengthOfLongestSubstring(String s) {
        //slindingwindow + hashMap
        Map<Character,Integer> mp=new HashMap<>();
        int maxLen=0;
        for(int l=0,r=0;r<s.length();r++){
            if(mp.containsKey(s.charAt(r))){
                // update l for next window
                l=Math.max(l,mp.get(s.charAt(r))+1);

            }
            mp.put(s.charAt(r),r);
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}