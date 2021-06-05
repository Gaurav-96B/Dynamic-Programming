class Solution
{
	public int findMinCost(String X, String Y, int costX, int costY)
	{
	    int dp[][]=new int[X.length()+1][Y.length()+1];
	    for(int row[]:dp)
	    {
	        Arrays.fill(row,-1);
	    }
		int LCS=minCost(X,Y,0,0,dp);
		return costX*(X.length()-LCS)+costY*(Y.length()-LCS);
	}
	public int minCost(String s1,String s2,int i,int j,int dp[][])
	{
	    if(i==s1.length()||j==s2.length())
	    {
	        return 0;
	    }
	    if(dp[i][j]!=-1)
	    {
	        return dp[i][j];
	    }
	    if(s1.charAt(i)==s2.charAt(j))
	    {
	        return dp[i][j]=1+minCost(s1,s2,i+1,j+1,dp);
	    }
	    else
	    {
	        return dp[i][j]=Math.max(minCost(s1,s2,i+1,j,dp),minCost(s1,s2,i,j+1,dp));
	    }
	}
}
