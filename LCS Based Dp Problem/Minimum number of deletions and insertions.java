class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int dp[][]=new int[str1.length()+1][str2.length()+1];
	    for(int row[]:dp)
	    {
	        Arrays.fill(row,-1);
	    }
	    int LCS=minInsertDelete(str1,str2,0,0,dp);
	    int insertion=str2.length()-LCS;
	    int deletion=str1.length()-LCS;
	    return insertion+deletion;
	} 
	public int minInsertDelete(String s1,String s2,int i,int j,int dp[][])
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
	        return dp[i][j]=1+minInsertDelete(s1,s2,i+1,j+1,dp);
	    }
	    else
	    {
	      return dp[i][j]=Math.max(minInsertDelete(s1,s2,i+1,j,dp),minInsertDelete(s2,s2,i,j+1,dp)) ;
	    }
	}
}
