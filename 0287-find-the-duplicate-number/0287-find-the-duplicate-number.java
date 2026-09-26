class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int in=Math.abs(nums[i])-1;
            if(nums[in]<0)ans=in+1;
            else nums[in]=-nums[in];
        }
        return ans;
        
    }
}