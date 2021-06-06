class Solution{
    static int longestPalin(String S){
        int dp[][]=new int[S.length()+1][S.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return LPSS(S,0,S.length()-1,dp);
        
    }
    static int LPSS(String s,int i,int j,int dp[][])
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
        if(s.charAt(i)==s.charAt(j))
        {
            int lpssRemainingString=j-i-1;
            if(lpssRemainingString==LPSS(s,i+1,j-1,dp))
            {
                return dp[i][j]=2+lpssRemainingString;
            }
        }
            return dp[i][j]=Math.max(LPSS(s,i+1,j,dp),LPSS(s,i,j-1,dp));
        
    }
}
