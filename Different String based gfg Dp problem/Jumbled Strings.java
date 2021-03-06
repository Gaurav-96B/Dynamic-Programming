class Solution
{
    public int TotalWays(String str)
    {
        String t="GEEKS";
        int dp[][]=new int[str.length()+1][t.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
       return distanceSubsequence(str,t,0,0,dp);
    }
    public int distanceSubsequence(String s,String t,int i,int j,int dp[][])
    {
        if(i==s.length()&&j==t.length())
        {
            return 1;
        }
        if(i!=s.length()&&j==t.length())
        {
            return 1;
        }
        if(i==s.length()&& j!=t.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j))
        {
            return dp[i][j]=(distanceSubsequence(s,t,i+1,j+1,dp)+distanceSubsequence(s,t,i+1,j,dp))%1000000007;
        }
        return dp[i][j]=distanceSubsequence(s,t,i+1,j,dp)%1000000007;
    }
}
