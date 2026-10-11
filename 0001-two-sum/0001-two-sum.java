class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int find=target-nums[i];
            if(mp.containsKey(find)){
                return new int[]{i,mp.get(find)};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}