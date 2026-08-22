class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)return mid;
            //check if left array is sorted
            else if(nums[low]<=nums[mid]){
                //check if target lies in this
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else{
                //soo, right is sorted right now check target lies in it or not
                if(target>nums[mid]&& target<=nums[high]){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
}