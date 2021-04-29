class Solution 
{
   
    static int eggDrop(int n, int k) 
	{
	  int dp[][]=new int[n+1][k+1];
	  for(int row[]:dp)
	  {
	      Arrays.fill(row,-1);
	  }
	    
	  return thersold(n,k,dp); 
	}
	static int thersold(int E,int F,int dp[][])
	{
	    int ans=Integer.MAX_VALUE;
	    if(F==0||F==1)
	    {
	        return F;
	    }
	    if(E==1)
	    {
	        return F;
	    }
	    if(dp[E][F]!=-1)
	    {
	        return dp[E][F];
	    }
	    else
	    {
	       for(int k=1;k<=F;k++) 
	       {
	           int temp=1+Math.max(thersold(E-1,k-1,dp),thersold(E,F-k,dp));
	            if(temp<ans)
	            {
	              ans=temp;  
	            }
	       }
	       return dp[E][F]=ans;
	    }
	}
}
