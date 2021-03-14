class Geeks {
   static int table[][]=new int[1001][1001];
    static int coin(int n,int a[],int sum)
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
        if(a[n-1]<=sum)
        {
           return table[n][sum]=coin(n,a,sum-a[n-1])+coin(n-1,a,sum);
        }
        else
        {
           return table[n][sum]=coin(n-1,a,sum);
        }
    }
    public long count(int n) {
        int a[]={3,5,10};
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                table[i][j]=-1;
            }
        }
        return coin(a.length,a,n);   
    }
}
