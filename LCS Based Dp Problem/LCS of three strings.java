class Solution 
{ 
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        int dp[][][]=new int[A.length()+1][B.length()+1][C.length()+1];
        for(int row[][]:dp)
        {
            for(int row1[]:row)
            {
                Arrays.fill(row1,-1);
            }
        }
        return LCS(A,B,C,0,0,0,dp);
    }
    int LCS(String s1,String s2,String s3,int i,int j,int k,int dp[][][])
    {
        if(i==s1.length()||j==s2.length()||k==s3.length())
        {
            return 0;
        }
        if(dp[i][j][k]!=-1)
        {
            return dp[i][j][k];
        }
        if(s1.charAt(i)==s2.charAt(j)&&s1.charAt(i)==s3.charAt(k))
        {
            return dp[i][j][k]=1+LCS(s1,s2,s3,i+1,j+1,k+1,dp);
        }
        else
        {
            return dp[i][j][k]=Math.max(Math.max(LCS(s1,s2,s3,i+1,j,k,dp),LCS(s1,s2,s3,i,j+1,k,dp)),LCS(s1,s2,s3,i,j,k+1,dp));
        }
    }
} 
