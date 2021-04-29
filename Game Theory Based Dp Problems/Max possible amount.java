class Solution
{
    int maxAmount(int arr[] , int n)
        {
            int dp[][]=new int[n+1][n+1];
            for(int row[]:dp)
            {
                Arrays.fill(row,-1);
            }
            return maxAmt(arr,0,n-1,dp);
        }
    int maxAmt(int a[],int l,int r,int dp[][])
    {
        if(l>=a.length||r<0)
        {
            return 0;
        }
        if(l+1==r)
        {
            return Math.max(a[l],a[r]);
        }
        if(dp[l][r]!=-1)
        {
            return dp[l][r];
        }
        int b=a[l]+Math.min(maxAmt(a,l+2,r,dp),maxAmt(a,l+1,r-1,dp));
        int c=a[r]+Math.min(maxAmt(a,l+1,r-1,dp),maxAmt(a,l,r-2,dp));
        return dp[l][r]=Math.max(b,c);
    } 
        
        
}
