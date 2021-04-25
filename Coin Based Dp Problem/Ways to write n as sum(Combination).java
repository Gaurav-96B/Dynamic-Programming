class Solution
{
  
    int countWays(int n)
    {
        int coins[]=new int[n-1];
        int amount=n;
        int dp[][]=new int[coins.length+1][amount+1];
        for(int i=0;i<n-1;i++)
        {
          coins[i]=i+1;  
        }
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return coinChange(coins,coins.length,amount,dp);
    }
    public int coinChange(int coins[],int n,int amount,int dp[][])
    {
        if(n==0&&amount!=0)
        {
            return 0;
        }
        if(n!=0&&amount==0)
        {
            return 1;
        }
        if(n==0&&amount==0)
        {
            return 1;
        }
        if(dp[n][amount]!=-1)
        {
            return dp[n][amount];
        }
        if(coins[n-1]<=amount)
        {
        return dp[n][amount]=(coinChange(coins,n,amount-coins[n-1],dp)+coinChange(coins,n-1,amount,dp))%1000000007;
        }
        return dp[n][amount]=coinChange(coins,n-1,amount,dp);
    }
    
    
    
    
}
