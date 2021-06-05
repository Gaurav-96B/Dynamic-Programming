class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int dp[][]=new int[str.length()+1][str.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return LRS(str,str,0,0,dp);
    }
    public int LRS(String s1,String s2,int i,int j,int dp[][])
    {
        if(i==s1.length()||j==s2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)&&i!=j)
        {
            return dp[i][j]=1+LRS(s1,s2,i+1,j+1,dp);
        }
        else
        {
            return dp[i][j]=Math.max(LRS(s1,s2,i+1,j,dp),LRS(s1,s2,i,j+1,dp));
        }
    }
}
