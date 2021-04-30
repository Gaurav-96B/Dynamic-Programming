class GFG {
    public int cutRod(int price[], int n) {
        int wt[]=new int[n];
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp)
        {
            java.util.Arrays.fill(row,-1);
        }
        for(int i=0;i<n;i++)
        {
           wt[i]=i+1; 
        }
        return knapsackSolve(n,n,price,wt,dp);
        
    }
    static int knapsackSolve(int n,int w,int v[],int w1[],int dp[][])
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
            return dp[n][w]=Math.max(v[n-1]+knapsackSolve(n,w-w1[n-1],v,w1,dp),knapsackSolve(n-1,w,v,w1,dp));
        }
        else
        {
            return dp[n][w]=knapsackSolve(n-1,w,v,w1,dp);
        }
        
    }
    
}
