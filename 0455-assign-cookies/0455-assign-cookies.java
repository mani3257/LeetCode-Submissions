class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gl=g.length,sl=s.length;
        if(gl==0||sl==0)return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0,cookie=0;
        while(cookie<sl && child<gl){
            if(g[child]<=s[cookie]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}