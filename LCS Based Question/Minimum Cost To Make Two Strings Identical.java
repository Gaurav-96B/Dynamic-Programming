class Solution
{
    static int table[][]=new int[1001][1001];
    int lcs(String s1,String s2,int n,int m)
    {
       if(m==0||n==0)
	   {
	       return 0;
	   }
	   if(table[n][m]>-1)
	   {
	       return table[n][m];
	   }
	   else if(s1.charAt(n-1)==s2.charAt(m-1))
	   {
	       return table[n][m]=1+lcs(s1,s2,n-1,m-1);
	   }
	   else
	   {
	       return table[n][m]=Math.max(lcs(s1,s2,n,m-1),lcs(s1,s2,n-1,m));
	   }
	} 
	public int findMinCost(String X, String Y, int costX, int costY)
	{
	    for(int i=0;i<=X.length();i++)
	        {
	            for(int j=0;j<=Y.length();j++)
	            {
	                table[i][j]=-1;
	            }
	        }
		int z=lcs(X,Y,X.length(),Y.length());
		return costX * (X.length()-z) + costY * (Y.length() -z);
	}
}
