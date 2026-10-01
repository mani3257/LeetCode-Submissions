class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        List<int[]>ls=new ArrayList<>();
        int n=intervals.length;
        int cnt=0;
        // int start=intervals[0][0];
        // int end=intervals[0][1];
        int[] curInterval=intervals[0];
        
        for(int i=1;i<n;i++){
            int curend=curInterval[1];
            if(intervals[i][0]<curend){
                cnt++;

            }
            else{
                curInterval=intervals[i];
                
            }
        }
        return cnt;
        
    }
}