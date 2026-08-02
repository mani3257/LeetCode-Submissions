class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int[] arr=new int[256];
        int maxLength=0;
        for(int left=0,right=0;right<n;right++){
            left=Math.max(left,arr[s.charAt(right)]);
            maxLength=Math.max(maxLength,right-left+1);
            arr[s.charAt(right)]=right+1;
        }
        return maxLength;
        
    }
}