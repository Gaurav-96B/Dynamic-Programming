class Solution{
   static int table[][]=new int[51][51];
    static int maxGoldCount(int M[][],int i,int j,int n,int m)
    {
        if(i>=n||i<0)
        {
            return 0;
        }
        if(j>=m)
        {
            return 0;
        }
        if(table[i][j]!=-1)
        {
            return table[i][j];
        }
        int x=maxGoldCount(M,i,j+1,n,m);
        int y=maxGoldCount(M,i-1,j+1,n,m);
        int z=maxGoldCount(M,i+1,j+1,n,m);
        return table[i][j]=M[i][j]+Math.max(Math.max(x,y),z);
    }
    static int maxGold(int n, int m, int M[][])
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                table[i][j]=-1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int z1=maxGoldCount(M,i,0,n,m);
            max=Math.max(z1,max);
        }
        return max;
    }
}
