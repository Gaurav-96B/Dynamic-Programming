class Solution
{
    static long countWays(int n)
    {
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return countWay(n,dp);
    }
    static long countWay(int n,long dp[])
    {
        if(n<=1)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=(countWay(n-1,dp)+countWay(n-2,dp)+countWay(n-3,dp))%1000000007;
    }
    
}
