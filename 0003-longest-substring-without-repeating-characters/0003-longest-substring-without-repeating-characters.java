class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(int left=0,right=0;right<s.length();right++){
            if(mp.containsKey(s.charAt(right))){
               left=Math.max(left, mp.get(s.charAt(right))+1);
            }
            mp.put(s.charAt(right),right);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
}