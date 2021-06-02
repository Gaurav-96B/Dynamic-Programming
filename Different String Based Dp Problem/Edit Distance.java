class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return editDistance(word1,word2,0,0,dp);
        
    }
    public int editDistance(String word1,String word2,int i,int j,int dp[][])
    {
        if(i== word1.length()) 
        {
            return word2.length()-j;
        }
        if(j== word2.length())
        {
        return word1.length()-i;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j))
        {
            return dp[i][j]=editDistance(word1,word2,i+1,j+1,dp);
        }
        else
        {
            int insertion=editDistance(word1,word2,i,j+1,dp);
            int deletion=editDistance(word1,word2,i+1,j,dp);
            int replace=editDistance(word1,word2,i+1,j+1,dp);
            return dp[i][j]=1+Math.min(Math.min(insertion,deletion),replace);
        }
    }
}



