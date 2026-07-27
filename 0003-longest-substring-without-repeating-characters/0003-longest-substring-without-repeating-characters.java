class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                cnt=Math.max(cnt,j-i+1);

            }

        }
        return cnt;
        
    }
}