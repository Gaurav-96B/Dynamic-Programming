class Solution
{
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int dp[][]=new int[X.length()+1][Y.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int LCS=LCS(X,Y,0,0,dp);
        return X.length()+Y.length()-LCS;
    }
    public static int LCS(String s1,String s2,int i,int j,int dp[][])
    {
        if(i==s1.length()||j==s2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=1+LCS(s1,s2,i+1,j+1,dp);
        }
        else
        {
            return dp[i][j]= Math.max(LCS(s1,s2,i+1,j,dp),LCS(s1,s2,i,j+1,dp));
        }
    }
}
