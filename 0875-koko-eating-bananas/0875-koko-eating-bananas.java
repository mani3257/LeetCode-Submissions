class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            max=Math.max(i,max);
        }
       
        //binery search
       int ans=max;
       int low=1;// bcz arr:1 to max
       while(low<=max){
            int mid=low+(max-low)/2;
            if(help(piles,h,mid)){
                ans=mid;
                max=mid-1;
            }
            else low=mid+1;
       } 
       return ans;
        
        
    }
        boolean help(int[] piles,int h,int k){
            long totalHours=0;
            for(int i:piles){
                totalHours+=(i+(long)k-1)/k;

            }
            return totalHours<=h;
        }
        
    
}