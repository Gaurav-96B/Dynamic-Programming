class Solution
{
    int dp[]=new int[100001];
    int countWays(int n)
    {
        
        if(n<=1)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        return dp[n]=(countWays(n-1)+countWays(n-2))%1000000007;
    }
}
