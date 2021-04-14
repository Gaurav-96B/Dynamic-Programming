class Solution {
    public int maxProfit(int k, int[] prices) {
        int dp[][][]=new int[2][k+1][prices.length];
        return maxProfit(prices,0,0,k,dp);
    }
    public int maxProfit(int prices[],int i,int buyOrSell,int k,int dp[][][])
    {
        if(i>=prices.length||k==0)
        {
            return 0;
        }
        if(dp[buyOrSell][k][i]!=0)
        {
            return dp[buyOrSell][k][i];
        }
        int profit=0;
        if(buyOrSell==0)
        {
            int buy=maxProfit(prices,i+1,1,k,dp)-prices[i];
            int notBuy=maxProfit(prices,i+1,0,k,dp);
            profit=Math.max(buy,notBuy);
            dp[buyOrSell][k][i]=profit;
        }
        else
        {
            int sell=maxProfit(prices,i+1,0,k-1,dp)+prices[i];
            int notSell=maxProfit(prices,i+1,1,k,dp);
            profit=Math.max(sell,notSell);
            dp[buyOrSell][k][i]=profit;
        }
        return dp[buyOrSell][k][i];
        
    }   
}




















