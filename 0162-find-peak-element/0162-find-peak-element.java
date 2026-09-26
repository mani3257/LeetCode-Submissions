class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<nums[mid+1])l=mid+1;
            else r=mid;
        }
        return l;
        
    }
}