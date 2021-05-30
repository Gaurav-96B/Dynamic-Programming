class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean dp[][][]=new Boolean[s1.length()+1][s2.length()+1][s3.length()+1];
        return helper(s1,s2,s3,0,0,0,dp); 
        
    }
    public boolean helper(String s1,String s2,String s3,int i,int j,int k,Boolean dp[][][])
    {
        if(k==s3.length())
        {
            if(i==s1.length()&&j==s2.length())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(i==s1.length()&&j==s2.length()&&k!=s3.length())
        {
            return false;
        }
        if(dp[i][j][k]!=null)
        {
            return dp[i][j][k];
        }
        boolean res1 = false;
        boolean res2 = false;
        if(i < s1.length())
        {
          if(s1.charAt(i) ==  s3.charAt(k))
          {
            res1=helper(s1,s2,s3,i+1,j,k+1,dp);
          }
        }
        if(j<s2.length())
        {
          if(s2.charAt(j) == s3.charAt(k))
          {
            res2=helper(s1,s2,s3,i,j+1,k+1,dp);
          }
        }
        
        if(res1==true||res2==true)
        {
            return dp[i][j][k]=true;
        }
        return dp[i][j][k]=false;
    }
}
