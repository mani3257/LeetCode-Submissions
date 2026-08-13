class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            if(mp.containsKey(find)){
                return new int[]{mp.get(find),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};

        
    }
}