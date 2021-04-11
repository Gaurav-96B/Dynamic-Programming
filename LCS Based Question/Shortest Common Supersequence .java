static int dp[][]=new int[101][101];
public static int shortestCommon(String x,String y,int m,int n)
{
    if(m==0||n==0)
    {
        return 0;
    }
    if(dp[m][n]!=-1)
    {
        return dp[m][n];
    }
    if(x.charAt(m-1)==y.charAt(n-1))
    {
        return dp[m][n]=1+shortestCommon(x,y,m-1,n-1);
    }
    return dp[m][n]=Math.max(shortestCommon(x,y,m-1,n),shortestCommon(x,y,m,n-1));
}
public static int shortestCommonSupersequence(String X, String Y, int m, int n)
{
    for(int i=0;i<=m;i++)
    {
        for(int j=0;j<=n;j++)
        {
            dp[i][j]=-1;
        }
    }
    int lcs=shortestCommon(X,Y,m,n);
    return X.length()+Y.length()-lcs;
}
