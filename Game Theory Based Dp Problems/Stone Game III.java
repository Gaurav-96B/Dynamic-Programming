class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int dp[]=new int[stoneValue.length+1];
        Arrays.fill(dp,-1);
       int alice=maxStone(stoneValue,0,dp);
        int sum=0;
        for(int i=0;i<stoneValue.length;i++)
        {
            sum=sum+stoneValue[i];
        }
        if(alice>sum-alice)
        {
            return "Alice";
        }
        if(alice<sum-alice)
        {
            return "Bob";
        }
        return "Tie";
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
    int score=0;
score=stoneValue[i] + Math.min(maxStone(stoneValue,i + 2,dp), Math.min(maxStone(stoneValue,i + 3,dp), maxStone(stoneValue,i + 4,dp))); 
        
if (i + 1 < stoneValue.length) 
score = Math.max(score, stoneValue[i] + stoneValue[i + 1] + Math.min(maxStone(stoneValue,i + 3,dp), Math.min(maxStone(stoneValue,i + 4,dp), maxStone(stoneValue,i + 5,dp))));
        
if (i + 2 < stoneValue.length) 
score = Math.max(score, stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] + Math.min(maxStone(stoneValue,i + 4,dp), Math.min(maxStone(stoneValue,i + 5,dp), maxStone(stoneValue,i + 6,dp))));   
      return dp[i]=score;  
       
                                           
    }
}
                                           
                                           
                                           
                                           
                                           
   
