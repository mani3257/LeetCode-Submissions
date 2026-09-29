class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Queue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k)minHeap.poll();

        }
        return minHeap.peek();
        
        
    }
}