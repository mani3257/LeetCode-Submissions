class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];
        
        // Step 2: Find the intersection point in the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Step 3: Find the entrance to the cycle (duplicate element)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}