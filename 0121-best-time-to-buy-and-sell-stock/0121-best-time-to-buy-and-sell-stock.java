class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                max_profit=Math.max(max_profit,prices[i]-min);
            }

        }
        return max_profit;
        
    }
}