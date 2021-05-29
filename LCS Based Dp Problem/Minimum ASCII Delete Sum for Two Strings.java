class Solution {
    
    public int minimumDeleteSum(String s1, String s2)
    {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int charSum=0;
        for(int i=0;i<s1.length();i++)
        {
            charSum=charSum+s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++)
        {
            charSum=charSum+s2.charAt(i);
        }
        return charSum-(2*lcs(s1,s2,s1.length(),s2.length(),dp));
    }
    public int lcs(String s1,String s2,int m,int n,int dp[][])
    {
       if(m==0|| n==0)
        {
        return 0;
        }
        if(dp[m-1][n-1]!=-1)
        {
            return dp[m-1][n-1];
        }
        else if(s1.charAt(m-1)==s2.charAt(n-1))
        {
       return  dp[m-1][n-1]=s1.charAt(m-1)+lcs(s1,s2,m-1,n-1,dp);
        }
        else
        {
       return  dp[m-1][n-1]=Math.max(lcs(s1,s2,m-1,n,dp),lcs(s1,s2,m,n-1,dp));
        } 
}
}
