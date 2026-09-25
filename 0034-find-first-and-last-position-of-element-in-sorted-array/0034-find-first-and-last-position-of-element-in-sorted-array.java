class Solution {
    public int[] searchRange(int[] nums, int target) {
        // use 2 functions(findfirst findlast)
        int first=findfirst(nums,target);
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
        // findfirst target position
        public int findfirst(int[] nums,int target){
            int low=0,high=nums.length-1;
            int firstindex=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target){
                    firstindex=mid;
                    high=mid-1;
                }
                else if(nums[mid]>target)high=mid-1;
                else low=mid+1;
            }
            return firstindex;
        }
         public int findlast(int[] nums,int target){
            int low=0,high=nums.length-1;
            int lastindex=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target){
                    lastindex=mid;
                    low=mid+1;
                }
                else if(nums[mid]>target)high=mid-1;
                else low=mid+1;
            }
            return lastindex;
        }
        

    
}