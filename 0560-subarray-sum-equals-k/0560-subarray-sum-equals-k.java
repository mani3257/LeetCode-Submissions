class Solution {
    public int subarraySum(int[] nums, int k) {
        // optimal using prefixsaum + HashMap
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int curSum=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            curSum+=nums[i];
            int find=curSum-k;
            if(mp.containsKey(find)){
                count+=mp.get(find);
            }
            mp.put(curSum,mp.getOrDefault(curSum,0)+1);
        }
        return count;
        
    }
}