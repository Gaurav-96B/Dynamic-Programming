class Solution {
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return count(s,t,s.length(),t.length(),dp);
        
    }
    public int count(String s,String t,int m,int n,int dp[][])
    {
        if(m==0&&n!=0)
        {
            return 0;
        }
        if(m==0&&n==0)
        {
            return 1;
        }
        if(m!=0&&n==0)
        {
            return 1;
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        if(s.charAt(m-1)==t.charAt(n-1))
        {
            return dp[m][n]=count(s,t,m-1,n-1,dp)+count(s,t,m-1,n,dp);
        }
        return dp[m][n]=count(s,t,m-1,n,dp);
    }
    
}
