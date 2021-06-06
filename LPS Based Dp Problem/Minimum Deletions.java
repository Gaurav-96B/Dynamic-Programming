class Solution{
    
    static int minimumNumberOfDeletions(String S)
    {
        int dp[][]=new int[S.length()+1][S.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int LPS=LPS(S,0,S.length()-1,dp);
        return S.length()-LPS;
    }
    static int LPS(String s1,int i,int j,int dp[][])
    {
        if(i>j)
        {
            return 0;
        }
        if(i==j)
        {
            return 1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s1.charAt(j))
        {
            return dp[i][j]=2+LPS(s1,i+1,j-1,dp);
        }
        else
        {
          return dp[i][j]=Math.max(LPS(s1,i+1,j,dp),LPS(s1,i,j-1,dp));
        }
    }
}
