class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each number
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min-heap storing keys, sorted by frequency ascending
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> mp.get(a) - mp.get(b));

        // Step 3: Keep heap size <= k
        for (int key : mp.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll(); // removes element with lowest frequency
            }
        }

        // Step 4: Extract the top k elements
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = minHeap.poll();
        }

        return ans;
    }
}