class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ls=new ArrayList<>();
        int n=intervals.length;
        if(n==1)return intervals;
        
        int[] prev=intervals[0];
        ls.add(prev);
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
                //ls.add(prev);
            }
            else{
                prev=intervals[i];
                ls.add(prev);
            }

        }
        return ls.toArray(new int[ls.size()][]);
        
    }
}