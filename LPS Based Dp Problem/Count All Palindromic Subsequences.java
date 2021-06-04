class Solution
{
    long countPS(String str)
    {
        long dp[][]=new long[str.length()+1][str.length()+1];
        for(long row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return countAllSubsequence(str,0,str.length()-1,dp);
    }
    public long countAllSubsequence(String str,int i,int j,long dp[][])
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
        if(str.charAt(i)==str.charAt(j))
        {
            return dp[i][j]=1+countAllSubsequence(str,i+1,j,dp)+countAllSubsequence(str,i,j-1,dp);
        }
        else
        {
          return dp[i][j]=countAllSubsequence(str,i+1,j,dp)+countAllSubsequence(str,i,j-1,dp)-countAllSubsequence(str,i+1,j-1,dp); 
        }
    }
}
