class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            max=Math.max(i,max);
        }
       
        //binery search
       int ans=max;// maximum ele in arr that can be ans though
       int low=1;// bcz arr:1 to max
       while(low<=max){
            int mid=low+(max-low)/2;
            if(help(piles,h,mid)){
                ans=mid;
                max=mid-1;// if curr mid is max then reduce to find min ele
            }
            else low=mid+1;
       } 
       return ans;
        
        
    }
        boolean help(int[] piles,int h,int mid){
            long totalHours=0;
            for(int i:piles){
                totalHours+=(i+(long)mid-1)/mid;

            }
            return totalHours<=h;
        }
        
    
}