class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int longest=0;
        //store all unique ele
        for(int i:nums){
            set.add(i);
            
        }
        for(int i:set){
            if(!set.contains(i-1)){
            int cur=i;
            int streek=1;
            while(set.contains(cur+1)){
                cur++;
                streek++;
            }
            longest=Math.max(longest,streek);
            }
        }

        
        return longest;
        
    }
}