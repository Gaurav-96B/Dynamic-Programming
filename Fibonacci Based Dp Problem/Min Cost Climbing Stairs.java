class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int cost1=countWayWithCost(cost,cost.length-1,dp);
        int cost2=countWayWithCost(cost,cost.length-2,dp);
        return Math.min(cost1,cost2);
        
    }
    public int countWayWithCost(int cost[],int currIndex,int dp[])
    {
        if(currIndex<=1)
        {
            return cost[currIndex];
        }
        if(dp[currIndex]!=-1)
        {
            return dp[currIndex];
        }
        int option1=cost[currIndex]+countWayWithCost(cost,currIndex-1,dp);
        int option2=cost[currIndex]+countWayWithCost(cost,currIndex-2,dp);
        return dp[currIndex]=Math.min(option1,option2);
        
    }
}
