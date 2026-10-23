class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        
        int n=intervals.length;
        int cnt=0;
        // int start=intervals[0][0];
        // int end=intervals[0][1];
        int prevInterval=intervals[0][1];
        
        for(int i=1;i<n;i++){
            
            if(intervals[i][0]<prevInterval){
                cnt++;

            }
            else{
                prevInterval=intervals[i][1];
                
            }
        }
        return cnt;
        
    }
}