class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min2=min;
                min=prices[i];
            }
            else if(prices[i]>=min && prices[i]<min2)
            {
                min2=prices[i];
            }
        }
        if(min+min2<=money)
        {
            return money-(min+min2);
        }
        else
        {
            return money;
        }
    }
}