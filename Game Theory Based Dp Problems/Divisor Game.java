class Solution {
    public boolean divisorGame(int n) {
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
       int result=winDecide(n,dp);
        if(result==1)
        {
            return true;
        }
        return false;
    }
    public int winDecide(int n,int dp[])
    {
        if(n==1)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        else
        {
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(winDecide(n-i,dp)==0)
                {
                    return dp[n]=1;
                }
            }
        }
            return dp[n]=0;
        }
        
    }
    }
