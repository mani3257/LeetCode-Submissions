class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));//sort by sort time
        List<int[]>ls=new ArrayList<>();
        int[] curInterval=intervals[0];//store the first interval
        ls.add(curInterval);
        int n=intervals.length;
        for(int i=1;i<n;i++){
            int curEnd=curInterval[1];
            int nextStart=intervals[i][0];
            int nextEnd=intervals[i][1];
            if(curEnd>=nextStart){
                //overlap
                curInterval[1]=Math.max(curEnd,nextEnd);
            }
            else{
                curInterval=intervals[i];
                ls.add(curInterval);
            }
        }
        return ls.toArray(new int[ls.size()][]);
    }
}