class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int LCS=minStep(word1,word2,0,0,dp);
        return word1.length()-LCS+word2.length()-LCS;
        
    }
    public int minStep(String word1,String word2,int i,int j,int dp[][])
    {
        if(i==word1.length()||j==word2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j))
        {
            return dp[i][j]=1+minStep(word1,word2,i+1,j+1,dp);
        }
        else
        {
    return dp[i][j]= Math.max(minStep(word1,word2,i+1,j,dp),minStep(word1,word2,i,j+1,dp));
        }
    }
}
