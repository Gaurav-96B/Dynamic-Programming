class Solution {
    public int maxProfit(int[] prices, int fee) {
        int dp[][]=new int[2][prices.length];
        for(int i=0;i<2;i++)
        {
              for(int j=0;j<prices.length;j++)  
              {
                dp[i][j]=-1;  
              }
        }
        return maxProfit(prices,0,0,fee,dp);
        
    }
     public int maxProfit(int prices[],int i,int buyOrSell,int fee,int dp[][])
    {
        if(i>=prices.length)
        {
            return 0;
        }
        if(dp[buyOrSell][i]!=-1)
        {
            return dp[buyOrSell][i];
        }
        int x=0;
        if(buyOrSell==0)
        {
            int buy=maxProfit(prices,i+1,1,fee,dp)-prices[i];
            int notBuy=maxProfit(prices,i+1,0,fee,dp);
            x=Math.max(buy,notBuy);
            dp[buyOrSell][i]=x;
        }
        else
        {
            int sell=maxProfit(prices,i+1,0,fee,dp)+prices[i]-fee;
            int notSell=maxProfit(prices,i+1,1,fee,dp);
            x=Math.max(sell,notSell);
            dp[buyOrSell][i]=x;
        }
        return dp[buyOrSell][i];
    }
    
    
    
}


