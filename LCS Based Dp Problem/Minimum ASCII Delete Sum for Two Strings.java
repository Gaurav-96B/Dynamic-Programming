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
        return charSum-(2*lcs(s1,s2,0,0,dp));
    }
    public int lcs(String s1,String s2,int i,int j,int dp[][])
    {
       if(i==s1.length()||j==s2.length())
        {
        return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        else if(s1.charAt(i)==s2.charAt(j))
        {
        return  dp[i][j]=s1.charAt(i)+lcs(s1,s2,i+1,j+1,dp);
        }
        else
        {
        return  dp[i][j]=Math.max(lcs(s1,s2,i+1,j,dp),lcs(s1,s2,i,j+1,dp));
        } 
}
}
