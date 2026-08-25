class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i:piles){
            max=Math.max(max,i);
        }
        int low=1;
        int ans=0;
        while(low<=max){
            int mid=(low+max)/2;
            if(eatAll(piles,h,mid)){
                ans=mid;
                max=mid-1;
            }
            else low=mid+1;
        }
        return ans;
        
      
    }
    boolean eatAll(int[] piles,int h,int mid){
        long totalHours=0;
        for(int i=0;i<piles.length;i++){
            totalHours+=(piles[i]+(long)mid-1)/mid;
        }
        return totalHours<=h;
    }
}