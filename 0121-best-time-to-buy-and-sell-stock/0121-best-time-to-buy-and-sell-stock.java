class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // Buy pointer 
        int right = 0; // Sell pointer 
        int max_profit = 0; // Declare and initialize max_profit

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left]; 
                max_profit = Math.max(max_profit, profit); 
            } else {
                left = right; // Slide left to new minimum 
            } 
            right++; 
        }

        return max_profit; // Return the result
    } 
}