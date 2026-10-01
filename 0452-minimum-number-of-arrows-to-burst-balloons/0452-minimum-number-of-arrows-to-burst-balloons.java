class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrows=1;
        int[] prev=points[0];
        for(int i=1;i<n;i++){
            if(prev[1]<points[i][0]){
                arrows++;
                prev[1]=points[i][1];
            }
        }
        return arrows;
        
    }
}