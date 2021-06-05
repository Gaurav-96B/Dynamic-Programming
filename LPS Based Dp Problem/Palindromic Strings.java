class Solution{

	public int isPossiblePalindrome(String s,int K) 
	{ 
	    int dp[][]=new int[s.length()+1][s.length()+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int LPS=LPS(s,0,s.length()-1,dp);
        int minDeletion=s.length()-LPS;
        if(K>=minDeletion)
        {
            return 1;
        }
        else
        {
            return 0;
        }
	} 
	static int LPS(String s1,int i,int j,int dp[][])
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
        if(s1.charAt(i)==s1.charAt(j))
        {
           return dp[i][j]=2+LPS(s1,i+1,j-1,dp);
        }
        else
        {
           return dp[i][j]=Math.max(LPS(s1,i+1,j,dp),LPS(s1,i,j-1,dp));
        }
    }
}
