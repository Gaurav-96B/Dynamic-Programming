class GFG {
    
    static int table[][]=new int[1001][1001];
    static int knapsackSolve(int n,int w,int v[],int w1[])
    {
        if(n==0||w==0)
        {
            return 0;
        }
        if(table[n][w]!=-1)
        {
            return table[n][w];
        }
        if(w1[n-1]<=w)
        {
            return table[n][w]=Math.max(v[n-1]+knapsackSolve(n,w-w1[n-1],v,w1),knapsackSolve(n-1,w,v,w1));
        }
        else
        {
            return table[n][w]=knapsackSolve(n-1,w,v,w1);
        }
        
    }
    public int cutRod(int price[], int n) {
        int wt[]=new int[n];
        for(int i=0;i<=n;i++)
	        {
	            for(int j=0;j<=n;j++)
	            {
	                table[i][j]=-1;
	            }
	        }
        for(int i=0;i<n;i++)
        {
           wt[i]=i+1; 
        }
        return knapsackSolve(n,n,price,wt);
    }
}
