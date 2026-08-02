class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majority=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>n/2){
                return nums[i];
            }

        }
        return -1;
        
    }
}