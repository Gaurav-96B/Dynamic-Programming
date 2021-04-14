class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[2][prices.length];
        for(int i=0;i<2;i++)
        {
              for(int j=0;j<prices.length;j++)  
              {
                dp[i][j]=-1;  
              }
        }
        return maxProfit(prices,0,0,dp);
        
    }
     public int maxProfit(int prices[],int i,int buyOrSell,int dp[][])
    {
        if(i>=prices.length)
        {
            return 0;
        }
        if(dp[buyOrSell][i]!=-1)
        {
            return dp[buyOrSell][i];
        }
        int profit=0;
        if(buyOrSell==0)
        {
            int buy=maxProfit(prices,i+1,1,dp)-prices[i];
            int notBuy=maxProfit(prices,i+1,0,dp);
            profit=Math.max(buy,notBuy);
            dp[buyOrSell][i]=profit;
        }
        else
        {
            int sell=maxProfit(prices,i+1,0,dp)+prices[i];
            int notSell=maxProfit(prices,i+1,1,dp);
            profit=Math.max(sell,notSell);
            dp[buyOrSell][i]=profit;
        }
        return dp[buyOrSell][i];
    }
    
    
}



