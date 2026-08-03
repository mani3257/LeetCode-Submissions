class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        
        if(n>m) return false;
        int[] s1freq=new int[26];
        int[] window=new int[26];
        for(int i=0;i<n;i++){
            s1freq[s1.charAt(i)-'a']++;// stored s1 char frequencies
            
        }
        for(int j=0;j<n;j++){
            window[s2.charAt(j)-'a']++;
        }
        if(Arrays.equals(s1freq,window))return true;
        for(int i=1;i<=m-n;i++){
            window[s2.charAt(i-1)-'a']--;
            window[s2.charAt(i+n-1)-'a']++;
            if(Arrays.equals(s1freq,window)) return true;

        }
        return false;

        
    }
}