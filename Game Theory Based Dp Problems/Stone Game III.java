class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int dp[]=new int[stoneValue.length+1];
        Arrays.fill(dp,-1);
       int alice= maxStone(stoneValue,0,dp);
        if(alice>0)
        {
            return "Alice";
        }
        if(alice==0)
        {
            return "Tie";
        }
        return "Bob";
        
    }
    public int maxStone(int stoneValue[],int i,int dp[])
    {
        if(i>=stoneValue.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        else
        {
        int ans=Integer.MIN_VALUE;
        ans=Math.max(ans,stoneValue[i]-maxStone(stoneValue,i+1,dp));
        if(i+1<stoneValue.length)
        {
        ans=Math.max(ans,stoneValue[i]+stoneValue[i+1]-maxStone(stoneValue,i+2,dp)); 
        }
        if(i+2<stoneValue.length)
        {
ans=Math.max(ans,stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-maxStone(stoneValue,i+3,dp));
        }
            return dp[i]=ans;   
        }
    }
}
