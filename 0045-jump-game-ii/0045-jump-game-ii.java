class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int l=0,r=0;
        int n=nums.length;
        while(r<n-1){
            int max_index=0;
            for(int index=l;index<=r;index++){
                max_index=Math.max(max_index,index+nums[index]);
            }
            l=r+1;
            r=max_index;
            jumps++;
        }
        return jumps;
        
    }
}