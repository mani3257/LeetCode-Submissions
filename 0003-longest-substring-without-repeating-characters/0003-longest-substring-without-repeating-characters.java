class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        int[] arr=new int[256];
        for(int left=0,right=0;right<n;right++){
            left=Math.max(left,arr[s.charAt(right)]);
            maxlen=Math.max(maxlen,right-left+1);
            arr[s.charAt(right)]=right+1;
        }
        return maxlen;
    }
}