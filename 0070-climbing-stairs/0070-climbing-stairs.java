class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n == 1) return 1;

        int p1=1;
        int p2=1;

        for(int i=2;i<=n;i++){
            int cur=p1+p2;
            p2=p1;
            p1=cur;
        }
        return p1;
        
    }
}