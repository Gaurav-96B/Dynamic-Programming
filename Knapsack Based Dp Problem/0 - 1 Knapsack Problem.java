class Knapsack 
{ 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int dp[][]=new int[n+1][W+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
         return knapsackSolve(W,wt,val,n,dp);
    }  
    
    static int knapsackSolve(int W,int wt[],int val[],int n,int dp[][])
    {
        if(n==0||W==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        if(wt[n-1]<=W)
        {
            return dp[n][W]=Math.max(val[n-1]+knapsackSolve(W-wt[n-1],wt,val,n-1,dp),knapsackSolve(W,wt,val,n-1,dp));
        }
        else
        {
            return dp[n][W]=knapsackSolve(W,wt,val,n-1,dp);
        }
    }
    
}


