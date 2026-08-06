class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>=nums[n/2])return nums[i];
        }
        return 0;
        
    }
}