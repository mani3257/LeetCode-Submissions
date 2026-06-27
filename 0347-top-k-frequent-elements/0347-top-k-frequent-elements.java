class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int maxFreq=0;
            int element=0;
            for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
                if(entry.getValue()>maxFreq){
                    maxFreq=entry.getValue();
                    element=entry.getKey();
                }
            }
            ans[i]=element;
            mp.remove(element);
        }
        return ans;
        
    }
}