class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n=s1.length();
        int m=s2.length();
        if(n>m)return false;
        int[] s1freq=new int[26];
        for(int i=0;i<n;i++){
            s1freq[s1.charAt(i)-'a']++;

        }
        for(int i=0;i<=m-n;i++){
            int[] s2freq=new int[26];
            for(int j=i;j<i+n;j++){
                s2freq[s2.charAt(j)-'a']++;
            }
            if(Arrays.equals(s1freq,s2freq)){
                return true;
            }

        }
        return false;
        
    }
}