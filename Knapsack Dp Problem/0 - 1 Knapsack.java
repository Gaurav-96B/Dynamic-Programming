class Knapsack 
{ 
     
    static int table[][]=new int[1001][1001];
    static int knapsackSolve(int W,int wt[],int val[],int n)
    {
        if(n==0||W==0)
        {
            return 0;
        }
        if(table[n][W]!=-1)
        {
            return table[n][W];
        }
        if(wt[n-1]<=W)
        {
            return table[n][W]=Math.max(val[n-1]+knapsackSolve(W-wt[n-1],wt,val,n-1),knapsackSolve(W,wt,val,n-1));
        }
        else
        {
            return table[n][W]=knapsackSolve(W,wt,val,n-1);
        }
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        for(int i=0;i<=n;i++)
	        {
	            for(int j=0;j<=W;j++)
	            {
	                table[i][j]=-1;
	            }
	        }
         return knapsackSolve(W,wt,val,n);
    } 
}


