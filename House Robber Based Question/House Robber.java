class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return maxAmount(nums,0,dp);   
    }
    public int maxAmount(int wealth[],int currIndex,int dp[])
    {
        if(currIndex>=wealth.length)
        {
            return 0;
        }
        if(dp[currIndex]!=-1)
        {
            return dp[currIndex];
        }
        int stealCurrent=wealth[currIndex]+maxAmount(wealth,currIndex+2,dp);
        int skipCurrent=maxAmount(wealth,currIndex+1,dp);
        return dp[currIndex]=Math.max(stealCurrent,skipCurrent);
    }
}
