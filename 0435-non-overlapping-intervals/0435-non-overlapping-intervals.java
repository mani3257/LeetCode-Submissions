class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int non_overlap=0;
        int prevEndtime=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0] <prevEndtime){
                non_overlap++;
            }
            else prevEndtime=intervals[i][1];
        }
        return non_overlap;
        
    }
}