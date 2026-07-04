class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Queue<Integer>minHeap=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
        for(int i:mp.keySet()){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }             
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=minHeap.poll();
        }
        return ans;
        
    }
}