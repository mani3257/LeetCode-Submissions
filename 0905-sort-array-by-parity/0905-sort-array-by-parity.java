class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            if(nums[l]%2==0)l++;
            else if(nums[r]%2!=0)r--;
            else{
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
            }
        }
        return nums;
        
    }
}