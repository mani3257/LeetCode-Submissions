class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int Longest=0;
        for(int i:nums){
            set.add(i);
            
        }
        for(int i:set){
           // int curNum=0,curStreak=0;
            if(!set.contains(i-1)){
                int cur=i;
                int streak=1;
                while(set.contains(cur+1)){
                    cur++;
                    streak++;
                }
                Longest=Math.max(Longest,streak);

            }
        }
        return Longest;
        
    }
}