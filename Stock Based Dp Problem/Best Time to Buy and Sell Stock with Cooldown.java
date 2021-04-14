class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[2][prices.length];
        return maxProfit1(prices,0,0,dp);   
    }
    public int maxProfit1(int prices[],int i,int buyOrSell,int dp[][])
    {
        if(i>=prices.length)
        {
            return 0;
        }
        if(dp[buyOrSell][i]!=0)
        {
            return dp[buyOrSell][i];
        }
        int profit=0;
        if(buyOrSell==0)
        {
            int buy=maxProfit1(prices,i+1,1,dp)-prices[i];
            int notBuy=maxProfit1(prices,i+1,0,dp);
            profit=Math.max(buy,notBuy);
            dp[buyOrSell][i]=profit;
        }
        else
        {
            int sell=maxProfit1(prices,i+2,0,dp)+prices[i];
            int notSell=maxProfit1(prices,i+1,1,dp);
            profit=Math.max(sell,notSell);
            dp[buyOrSell][i]=profit;
        }
        return dp[buyOrSell][i];
    }
}
