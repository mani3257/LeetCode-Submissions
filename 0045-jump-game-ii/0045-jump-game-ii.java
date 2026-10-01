class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int far=0;
        int minjumps=0;
        int l=0;
        for(int i=0;i<n-1;i++){
            if(i>far)return -1;
            far=Math.max(far,i+nums[i]);
            if(l==i){
                minjumps++;
                l=far;
            }
        }
        return minjumps;
        
    }
}