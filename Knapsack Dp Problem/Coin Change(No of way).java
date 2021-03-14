class Solution
{
    static long table[][]=new long[1001][1001];
    public long coinChange(int S[],int n,int sum)
    {
        if(n==0&&sum!=0)
        {
            return 0;
        }
        if(n==0&&sum==0)
        {
            return 1;
        }
        if(n!=0&&sum==0)
        {
            return 1;
        }
        if(table[n][sum]!=-1)
        {
            return table[n][sum];
        }
        if(S[n-1]<=sum)
        {
            return table[n][sum]=coinChange(S,n,sum-S[n-1])+coinChange(S,n-1,sum);
        }
        return coinChange(S,n-1,sum);
    }
    public long count(int S[], int m, int n) 
    { 
        for(int i=0;i<=m;i++)
            {
                for(int j=0;j<=n;j++)
                {
                    table[i][j]=-1;
                }
            }
        return coinChange(S,m,n);
    } 
}
