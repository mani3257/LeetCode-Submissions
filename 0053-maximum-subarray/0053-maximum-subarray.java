class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int i=0;i<n;i++){
        
                cur_sum=Math.max(nums[i],cur_sum+nums[i]);
                max=Math.max(cur_sum,max);
            
        }
        return max;
    }
}