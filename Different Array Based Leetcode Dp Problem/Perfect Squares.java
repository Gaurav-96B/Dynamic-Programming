
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return perfectSquare(n,dp);
    }
    private int perfectSquare(int n,int[] dp){
        if(n == 0)
        {
            return 0;
        }
        if(dp[n]!=-1) 
        {
            return dp[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1;i*i<=n;i++)
        {
            int x=perfectSquare(n-i*i,dp) + 1;
            min=Math.min(x,min);
        }
        return dp[n]=min;
    }
}
