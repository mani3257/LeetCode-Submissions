class Solution {
    public int findContentChildren(int[] g, int[] s) { 
        int n=g.length,m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        if(n==0 || m==0)return 0;
        int l=0,r=0;
        
       while(l<n && r<m){
        if(g[l]<=s[r]){
            l++;
        }
        r++;
       }

        return l;
        
    }
}