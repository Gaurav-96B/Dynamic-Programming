class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return lcs(text1,text2,text1.length(),text2.length(),dp);  
   }
    public int lcs(String text1,String text2,int m,int n,int dp[][])
    {
        if(m==0||n==0)
        {
            return 0;
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        if(text1.charAt(m-1)==text2.charAt(n-1))
        {
            return dp[m][n]=1+lcs(text1,text2,m-1,n-1,dp);
        }
        else
        {
        return dp[m][n]=Math.max(lcs(text1,text2,m-1,n,dp),lcs(text1,text2,m,n-1,dp));
        }
    }
}
