class Solution
{
   
    public int countWays(int arr[], int m, int N) 
    { 
        int dp[][]=new int[m+1][N+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return coinChange(arr,m,N,dp);
          
    } 
   int coinChange(int S[], int n, int N,int dp[][])
    {
    if (N == 0) {
        return 1;
    }
    if (N < 0) {
        return 0;
    }
    if(dp[n][N]!=-1)
    {
        return dp[n][N];
    }
    int result = 0;
    for (int i = 0; i < n; i++)
    {
        result=result%1000000007+coinChange(S, n, N - S[i],dp)%1000000007;
        dp[n][N]=result;
    }
    return dp[n][N];
}
    
    
    
    
    
    
    
    
    
}
