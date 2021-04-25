class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return countWay(n,dp);
    }
    public int countWay(int n,int dp[])
    {
        if(n<=1)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int option1=countWay(n-1,dp);
        int option2=countWay(n-2,dp);
        return dp[n]=option1+option2;
    }
}
