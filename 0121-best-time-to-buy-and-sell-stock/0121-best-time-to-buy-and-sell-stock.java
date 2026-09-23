class Solution {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int profit=0;
        for(int p:prices)
        {
            if(p<min)
            {
                min=p;
            }
            else if(p-min>profit)
            {
                profit=p-min;
            }
        }
        return profit;
    }
}