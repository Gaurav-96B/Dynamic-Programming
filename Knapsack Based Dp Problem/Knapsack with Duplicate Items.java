class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int dp[][]=new int[N+1][W+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return knapsack(N,W,val,wt,dp);
    }
    static int knapsack(int n,int w,int v[],int w1[],int dp[][])
    {
        if(n==0||w==0)
        {
            return 0;
        }
        if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }
        if(w1[n-1]<=w)
        {
            return dp[n][w]=Math.max(v[n-1]+knapsack(n,w-w1[n-1],v,w1,dp),knapsack(n-1,w,v,w1,dp));
        }
        else
        {
            return dp[n][w]=knapsack(n-1,w,v,w1,dp);
        }
        
    }
    
    
    
}
