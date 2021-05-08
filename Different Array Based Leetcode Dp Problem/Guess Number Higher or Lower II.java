
public class Solution {
    public int getMoneyAmount(int n) 
    {
        int dp[][] = new int[n+1][n+1];
        for(int[] row: dp)
        {
            Arrays.fill(row,-1);
        }
        return solve(1,n,dp);
    }
    public int solve(int l, int r,int dp[][]){
        if(l >= r)
        {
            return 0;
        }
        if(dp[l][r] !=-1)
        {
            return dp[l][r];
        }
        int min=Integer.MAX_VALUE;
        for(int i = l; i <= r; i++)
        {
        min=Math.min(min,Math.max(i + solve(l, i-1,dp), i + solve(i+1, r,dp)));
        dp[l][r]=min;
        }
        return dp[l][r];
    }
}
