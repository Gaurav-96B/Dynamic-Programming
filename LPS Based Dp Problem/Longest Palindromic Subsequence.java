class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return LPS(s,0,s.length()-1,dp); 
    }
    public int LPS(String s,int i,int j,int dp[][])
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
            return dp[i][j]= 2+LPS(s,i+1,j-1,dp);
        }
        else
        {
            return dp[i][j]= Math.max(LPS(s,i+1,j,dp),LPS(s,i,j-1,dp));
        }
    }
}
