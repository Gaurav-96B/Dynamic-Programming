class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length+1][amount+1];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        int minCoin=minCoin(coins,amount,coins.length,dp);
        if(minCoin==Integer.MAX_VALUE-1)
        {
           return -1; 
        }
        return minCoin;
    }
    public int minCoin(int coins[],int amount,int index,int dp[][])
    {
        if(index==0)
        {
            return Integer.MAX_VALUE-1;
        }
        if(amount<=0)
        {
            return 0;
        }
        if(dp[index][amount]!=-1)
        {
           return dp[index][amount];
        }
        if(coins[index-1]<=amount)
        {
        int option1=1+minCoin(coins,amount-coins[index-1],index,dp);
        int option2=minCoin(coins,amount,index-1,dp);
        return dp[index][amount]=Math.min(option1,option2);
            
        }
        else
        {
        return dp[index][amount]=minCoin(coins,amount,index-1,dp);
        }
        
    

    }
}








