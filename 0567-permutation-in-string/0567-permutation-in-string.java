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
            window[s2.charAt(j)-'a']++;// stores s1 size chars of  s2 string ('e','i')
        }
        if(Arrays.equals(s1freq,window))return true;//checks the 2 arrays if first window matchs s1
        for(int i=1;i<=m-n;i++){//check up to last window's first char
            window[s2.charAt(i-1)-'a']--;//shrink from left, (as we already stores the first 2 chars of s2)remove 1st char from the 2nd char 
            window[s2.charAt(i+n-1)-'a']++;//add next char to attain window size(windowsize(n)-1) that aminatins window size
            if(Arrays.equals(s1freq,window)) return true;

        }
        return false;

        
    }
}