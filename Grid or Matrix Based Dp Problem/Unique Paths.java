class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return countPath(m,n,0,0,dp);
        
    }
    public int countPath(int m,int n,int i,int j,int dp[][])
    {
        if(i==m-1&&j==n-1)
        {
            return 1;
        }
        if(i==m||j==n)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        return dp[i][j]=countPath(m,n,i+1,j,dp)+countPath(m,n,i,j+1,dp);
    }   
}
