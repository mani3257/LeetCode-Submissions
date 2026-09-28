class Solution {
    public boolean canJump(int[] nums) 
    {
        int n=nums.length;
        int max_index=0;
        for(int i=0;i<n;i++){
            if(i>max_index)return false;
            max_index=Math.max(max_index,i+nums[i]);
        }
        return true;
    }
}