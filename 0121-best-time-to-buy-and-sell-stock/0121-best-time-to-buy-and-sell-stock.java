class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cp = prices[0];

        for(int i =1; i<prices.length; i++){
            int curr = prices[i];
            if(curr > cp){
                profit = Math.max(profit, curr-cp);
            }
            else{
                cp = Math.min(curr,cp);
            }
        }
        return profit;

    }
}