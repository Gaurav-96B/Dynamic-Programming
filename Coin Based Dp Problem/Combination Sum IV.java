class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        return coinChange(nums,target,dp);
        
    }
    int coinChange(int S[],int N,int dp[])
    {
    if (N == 0) {
        return 1;
    }
    if (N < 0) {
        return 0;
    }
    if(dp[N]!=-1)
    {
        return dp[N];
    }
    int result = 0;
    for (int i = 0; i < S.length; i++)
    {
        result=result+coinChange(S,N - S[i],dp);
        dp[N]=result;
    }
    return dp[N]=result;
}
}
