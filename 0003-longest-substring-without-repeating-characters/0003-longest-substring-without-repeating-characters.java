class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int max_length=0;
        for(int l=0,r=0;r<s.length();r++){
            if(mp.containsKey(s.charAt(r))){
                l=Math.max(l,mp.get(s.charAt(r))+1);
            }
            mp.put(s.charAt(r),r);
            max_length=Math.max(max_length,r-l+1);

        }
        return max_length;
        
    }
}