class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Optimal  Approch using ash Map
        // T.C = O(N) S.C = O(N)
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int find=target-nums[i];
            if(mp.containsKey(find)){
                return new int[]{mp.get(find),i};
            }
            mp.put(nums[i],i);

        }
        return new int[]{-1,-1};
        



    }
}