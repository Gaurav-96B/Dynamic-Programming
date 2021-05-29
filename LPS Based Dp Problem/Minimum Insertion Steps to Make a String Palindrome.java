class Solution {
    public int minInsertions(String s) {
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int z=lps(s,0,s.length()-1,dp);
        return s.length()-z;
    }
    static int lps(String s,int i,int j,int dp[][])
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
        else if(s.charAt(i)==s.charAt(j))
        {
            return dp[i][j]=2+lps(s,i+1,j-1,dp);
        }
        else
        {
            return dp[i][j]=Math.max(lps(s,i+1,j,dp),lps(s,i,j-1,dp));
        }
    }
}
