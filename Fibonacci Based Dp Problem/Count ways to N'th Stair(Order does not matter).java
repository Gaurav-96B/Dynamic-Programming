class Solution
{
    
    public long nthStair(int n)
    {
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return nth(n,dp);
    }
    public long nth(int n,long dp[])
    {
       if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=nthStair(n-1)+nthStair(n-2); 
    }
    
    
    
    
}
