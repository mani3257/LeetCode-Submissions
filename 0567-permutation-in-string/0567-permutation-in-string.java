class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        int[] s1freq=new int[26];
        int[] window=new int[26];
        for(int i=0;i<n;i++){
            s1freq[s1.charAt(i)-'a']++;// stored s1 char frequencies
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1freq,window))return true;
        for(int i=n;i<m;i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-n)-'a']--;//shrink from left ,n indexs bedore window size to maintain window size 'n'
            if(Arrays.equals(s1freq,window)) return true;

        }
        return false;

        
    }
}